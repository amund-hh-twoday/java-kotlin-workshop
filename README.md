# java-kotlin-workshop

## Oppgave: Bygg en Todo-app med Spring Boot

### Oppgave 1 - Basic web-app

#### 1.1

Last ned Spring Boot ved hjelp av Spring Initializr.
Legg til avhengighetene Spring Web og Spring JDBC. Åpne prosjektet i Intellij, kjør Maven "clean install" og
start deretter applikasjonen. Når du ser dette har du klart oppgaven: <img src="/src/main/resources/img/1.png">

#### 1.2

Lag en Controller-klasse med et POST-endepunkt som tar imot en streng, og returnerer den samme strengen i en 200 OK
respons.

#### 1.3

Lag en Service-klasse med en add()-metode som tar inn en streng.
Bruk autowiring til å hente inn Servicen i Controlleren og kall add()-metoden derfra.
Passer inn strengen og lagre den i en lokal variabel i Service-klassen.

#### 1.4

Lag et nytt GET-endepunkt i controlleren. Den skal kalle en get()-metode i Servicen som returnerer den lagrede strengen,
og returnere denne til klienten

### Oppgave 2 - Dataklasser

#### 2.1

Lag en dataklasse med navn TodoEntry. Den skal inneholde feltene id (UUID), timestamp (Timestamp), title (String) og
content (String), som alle er påkrevd.

#### 2.2

Endre Controlleren til å ta inn to parametere: title og content.

#### 2.3

Endre add()-metoden i Servicen til å bygge en TodoEntry og returnere iden til objektet.

#### 2.4

add()-metoden i Servicen skal nå returnere id

### Oppgave 3 - Koble på database