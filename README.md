# Specifikacija projektnog zadatka - ljeto 2026

Projekat podrazumijeva izradu jednostavne web aplikacije (npr. u Node.js, Python Flask ili Django okruženju). Aplikacija može biti kreirana za potrebe drugih predmeta, ali mora biti funkcionalna i proširena u skladu sa sljedećim zahtjevima.

## Osnovni zahtjevi

1. **Dockerizacija aplikacije** – aplikaciju je potrebno spakovati u Docker kontejner. **(5 poena)**

2. **Kreiranje Kubernetes klastera** – rasporediti aplikaciju unutar Kubernetes klastera. **(5 poena)**

## Napredne tehnike za baze podataka

3. **Replikacija baze podataka** – implementirati primarnu (*write*) i najmanje jednu replika (*read*) instancu baze podataka. Upiti za čitanje treba da koriste replike, dok se upisi izvršavaju nad primarnom instancom. **(5 poena)**

4. **Particionisanje baze podataka** – implementirati logičko particionisanje podataka. **(5 poena)**

5. **Sharding baze podataka** – primijeniti tehniku shardovanja tako da se podaci raspoređuju između više instanci baze podataka (npr. prema korisnicima, regionima ili drugim kriterijumima). **(5 poena)**

## Automatizacija i DevOps

6. **CI/CD pipeline** – realizovati automatizovani proces izgradnje, testiranja i/ili deploy-a korišćenjem alata kao što su GitHub Actions, GitLab CI ili Jenkins. **(10 poena)**

## Dodatne tehnike i alati

Svaka implementirana tehnika iz ove grupe donosi **5 poena**, osim ako nije drugačije naznačeno.

- Redis caching
- Rate limiting
- Kubernetes alati Helm + HPA
- Ingress + TLS (Let's Encrypt)
- Service Mesh (Istio, Linkerd i sl.) **(10 poena)**
- Prometheus + Grafana
- K6 load testing
- GitOps (ArgoCD, FluxCD i sl.) **(10 poena)**
- Distribuirani sistemi za razmjenu poruka (Apache Kafka, RabbitMQ i sl.)
- Centralizovani logovi (ELK, Loki, Graylog i sl.)
- Druga tehnika ili alat po izboru studenta, uz prethodno odobrenje predmetnog nastavnika.

## Demonstracija

Potrebno je demonstrirati:

* funkcionalan rad aplikacije u Docker i Kubernetes okruženju;
* load balancing između najmanje dvije instance aplikacije;
* najmanje jednu situaciju koja pokazuje otpornost sistema (npr. pad instance, automatski restart, autoskaliranje, failover baze podataka i sl.);
* implementirane dodatne funkcionalnosti za koje se ostvaruju poeni.

## Bodovanje

Uz svaki od zahtjeva naveden je broj poena. Studenti mogu birati koje će zahtjeve implementirati, pri čemu ukupan broj osvojenih poena ne može preći **30 poena**.

# Literatura

Alex Xu - System Design Interview: An Insider's Guide (2nd edition)

Erich Gamma, Richard Helm, Ralph Johnson, John M. Vlissides - Design Patterns: Elements of Reusable Object-Oriented Software

# Teme za prezentovanje 

Link za prijavu teme:
https://docs.google.com/spreadsheets/d/1x8huO_e0I8vkCsCgqlQO5IjyDAZ6QxHtVtqJfIZsaIY/edit?usp=sharing.

Upišite vaša imena i izabranu temu u komentaru.

