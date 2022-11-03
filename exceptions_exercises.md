# Oppgave 1
Vi må sjekke om productId som brukes når et Movie-objekt opprettes er korrekt.

Vi ønsker ikke at productId skal kunne være et negativt tall, men nå er det ingenting som forhindrer dette. Forsøk å opprett et Movie-objekt med et negativt tall som productId.

Løs dette problemet med å legge til en sjekk i konstruktøren til Movie, som kaster en IllegalArgumentException dersom productId er et negativt tall. Legg til en melding i exception slik at kode som fanger opp denne kan få vite hva som skjedde.

Hva skjer? Krasjer programmet?

# Oppgave 2
For å forhindre at programmet krasjer når en exception kastes, må vi catche den. Legg koden som kan forårsake en exception i en try-catch blokk og håndter den ved å catche den. I catch-uttrykket kan du skrive ut en stacktrace ved å kalle printStackTrace() på exception-objektet:

catch (Exception e) {
e.printStackTrace();
}
Hvis du lager nye objekter av typen Movie innenfor try-blokken så får du nå kanskje et problem med å legge dem til listen av produkter utenfor blokken? Du må kanskje deklarere variablene før try-blokken, og tilordne dem inne i try-blokken. Eller legge dem til innenfor try-blokken. Velg en løsning som gjør at koden kompilerer.

Fungerer programmet som forventet?

Bør du legge alle linjene som oppretter filmer i en try-catch, eller ha en egen try-catch blokk for hver? Hva er forskjellen?

I dette tilfellet er det ingenting som hindrer deg fra å kaste en exception, uten å håndtere den. Det er fordi IllegalArgumentException ikke er en checked exception.

# Oppgave 3
Opprett en bok med en negativ productId (legg til productId til Book-klassens konstruktør hvis du ikke har den). Sjekk om productId er negativ, og kast en Exception istedet for en IllegalArgumentException

Koden vil ikke kompilere og IntelliJ vil indikere at du kaster en exception som ikke er håndtert. Siden Exception er en checked exception så må den håndteres på en måte. Du kan catche den i konstruktøren, eller deklarere at konstruktøren kan kaste en exception, slik at koden som kaller den må håndtere den istedet. Deklarer at konstruktøren kan kaste en exception slik:

public Book(long productId, String title, String author, int price) throws Exception {
Alt er ok med Book, men hva med main-metoden nå?

Nå må vi håndtere denne i main-metoden. Legg koden der objektet opprettes i en try-catch. Håndter exception ved å skrive ut stacktrace.

Nå skal programmet kjøre uten å krasje, og kun skrive ut stacktrace hvis en Book eller Movie blir opprettet med en negativ productId.

# Oppgave 4
Vi vil lage en egen Exception for å håndtere tilfellet med ukurrant productId slik at vi kan ta vare på productId som ble forsøkt brukt og skrive dette ut når vi catcher denne i main-metoden.

Lag en ny klasse med navnet IncorrectProductIdException som arver fra 
Exception.

Lag en instansvariabel av typen long, med navnet incorrectNumber og en konstruktør som tar en parameter av samme type og tilordner dette til variabelen.

Overstyr String getMessage() og returner en melding om at tallet er feil, og inkluder tallet i meldingen.

I konstruktøren til Book, kast IncorrectProductIdException istedet for Exception.

Bruk konstruktøren og send et ugyldig productId som parameter. Modifiser signaturen til konstruktøren slik at den indikerer at den kaster en IncorrectProductIdException og ikke Exception. Dette gjør at vi kun må catche denne typen, og ikke evt. andre typer som arver fra Exception.

Forsøk å lage nye bøker med konstruktøren til Book. Håndter exceptions ved å skrive ut en melding:

catch (IncorrectProductIdException e) {
System.out.println(e.getMessage());
}
Forsøk å kjøre koden. Ser du meldingen? Hva tenker du om å bruke exceptions? Hvor kan dette være nyttig?

# Oppgave 5
Opprett en ny klasse med en main-metode (slik at du kan kjøre klassen som et program).

Legg til en statisk variabel i klassen som du kaller "counter" og initialiser den til 0.

Lag en ny (statisk) metode i klassen som du kaller "forever". Metoden skal ikke ta noen parametere. Kall denne metoden fra main-metoden din.

I metoden øker du verdien av "counter" til 1 og skriver ut verdien.

Til slutt kaller du på den samme metoden fra denne metoden. Altså, metoden skal kalle seg selv. Hva skjer når du kjører programmet?

Hva blir verdien av counter?