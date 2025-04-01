const express = require("express");
const app = express();

const Client = require("pg").Client;
const HashRing = require("hashring");

const clients = {
	"5433": new Client({
		"host": "localhost",
		"port": "5433",
		"user": "kosta123",
		"password": "kosta123",
		"database": "test"
	}),
	"5432": new Client({
		"host": "192.168.1.128",
		"port": "5432",
		"user": "kosta123",
		"password": "kosta123",
		"database": "test"
	})
};

const hr = new HashRing();
hr.add("5432");
hr.add("5433");

async function connect(){
	await clients["5433"].connect();
	await clients["5432"].connect();
}
connect();


app.post("/", async(req, res) => {
	console.log("Here I am!");
	const name = req.query.name;
	const server = hr.get(name);
	console.log(server);
	await clients[server].query("insert into students(name) values ($1)", [name]);
	res.send("OK!");
});

app.listen(8080, () => {
	console.log("Listening on 8080.");	
});