const http = require('http')

const server = http.createServer((req, res) => {
	res.write("Hello "+process.argv[2]+"!");
	res.end();
});


const port = process.argv[3];
server.listen(port, () => {
	console.log("Server started on port "+port);
});