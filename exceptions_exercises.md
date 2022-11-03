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