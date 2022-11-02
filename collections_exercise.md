Oppgave 1
Fortsett med Amazon-prosjektet. 

~~Bytt ut arrays med generiske lister.~~

~~Lag en generisk liste med Book-objekter, legg til noen bøker. Itererer over listen og kall printBookDetails på hver bok.~~

~~Lag også en generisk liste med Movie-objekter, iterer over disse og kall printMovieDetails på hvert objekt.~~

Hva måtte du endre i løkkene når du bruker en List istedet for array?
- bytte fra array indexing til get()

Er det noen forskjell mellom for-løkken og for-each-løkken?



Oppgave 2
Vi må legge til en productId til Movie-klassen for å identifisere hver unike film i butikken.

~~Legg en ny privat variabel til Movie-klassen med navnet productId og med typen long.~~

~~Legg også til public setters og getters for productId. Legg også til productId til alle konstruktørene i klassen slik at man må sette en productId når man oppretter et Movie-ojekt. Velg deg dine egne unike id'er for hver Movie du oppretter.~~

~~Endre printMovieDetails slik at denne også skriver ut productId.~~

Oppgave 3
Vi må også kunne søke etter filmer og finne en film med en spesifikk productId.

~~Lag en ny metode som heter findMovieById som returnerer et Movie-objekt og tar to parametere:~~

~~- long productId (id som skal søkes etter)~~

~~- List<Movie> (listen av filmer som det skal søkes i)~~

~~Itererer gjennom listen i metoden og returnerer filmen med id som det søkes etter.~~

~~Hvis det ikke finnes noen film med den spesifiserte id'en, returner null.~~

~~I main-metoden, bruk findMovieById for å søke etter en film.~~

~~Hvis en film ble funnet, skriv ut "Found this movie: " etterfulgt av utskriften fra printMovieDetails method.~~

~~Hvis ingen film ble funnet, skriv ut "Didn't find a movie with productId: " e.l. etterfulgt av id'en som ble søkt etter.~~

~~Prøv å kjør programmet med id'er som finnes og ikke finnes!~~


Oppgave 4
Er det noen ulemper med å bruke en List som i forrige oppgave?

Hva om du har millioner av filmer i listen? Søket vil noen ganger ta veldig lang tid. Avhengig av hvor langt i listen man må søke vil søketiden variere.

En List er ikke den beste typen kolleksjon å bruke når man søker på en id.

~~Prøv istedet å bruke Map. Legg hver Movie i et Map og bruk productId som nøkkel.~~

~~Lag et Map kalt movieMap med Long som nøkkel og Movie som verdier.~~

Prøv å finne filmer nå i movieMap istedet for listen. Er det noen fordeler med Map her? Hva med tiden det tar å søke?

Oppgave 5
Lag et program som returner antall tegn og antall unike tegn i en streng som er skrevet inn av brukeren. Bruk Set<Character> for å finne unike tegn.

Et eksempel på hvordan dette kan se ut (tekst i grønt er skrevet inn av brukeren):

Please write something: Hello, world!
The number of characters: 13
The number of unique characters: 10

Oppgave 6 (Ekstra): Filtrering av bøker
Implementer en metode filterByAuthor som returnerer en liste uten bøker skrevet av en angitt forfatter og skriv ut tittelen på bøkene.

Du kan forbedre metoden med å ignorere store/små bokstaver og evt. søke i en del av navnet.

Lag også en metode for å skrive ut den siste boken som er lagt til.



Oppgave 7 (Ekstra): Anagram
Anagram er en mer generell form for palindrom som vi hadde om i en tidligere oppgave. Et anagram er et ord som lages ved å stokke om på bokstavene i et annet ord.

Implementer en metode isAnagram som sjekker om to ord er anagrammer.

Eks.

regnskap = krepsagn
gitar = artig
anders = danser
Hint:

Lag to sorterte lister basert på bokstavene i hvert ord. Hvis listene er like, er ordene anagrammer.

Oppgave 8 (Ekstra): Filtrering på dato
Ingen løsningsforslag på denne oppgaven.

Legg til et dato-felt (LocalDate) på Book-klassen og lag en ny metode som kan hente ut bøker skrevet et angitt årstall. Skriv ut tittelen på boken, evt. sammen med årstallet.