# Oppgave 1
~~Hva skjer om vi fjerner printDetails fra Movie-klassen? Prøv å endre navnet til printDetails2 eller noe annet.~~

~~IntelliJ vil markere @Override-annotasjonen som en feil, siden metoden ikke overstyrer noen metode i superklassen.  Fjern annotasjonen.~~

~~Kjør programmet.~~

Det skal fortsatt kjøre siden Movie bruker printDetails-metoden fra superklassen Product om den ikke har en egen implementasjon.

Hvis vi legger til en ny type av produkt er det ingenting som tvinger oss til å implementere denne metoden. Kaller vi den vil vi kun få informasjon om productId og price. Er det tilstrekkelig å med denne informasjonen for alle typer produkter? Hvis ikke vil vi tvinge alle typer produkter til å implementere deres egen versjon av denne metoden.

Vi vil ikke bruke arv for å gjenbruke metoder i superklassen, men vi vil sikre oss at metoden blir implementert i alle subklasser så vi kan håndtere alle produkter på en generell måte ved å kalle printDetails.

~~Dette kan vi gjøre ved å fjerne implementasjonen i Product-klassen og gjøre metoden abstract. Gjør dette slik at metoden ser slik ut i Product:~~

~~public abstract void printDetails();
Hvis navnet fortsatt er endret i Movie så vil IntelliJ nå advare om at klassen Movie ikke overstyrer metoden printDetails.~~

~~Endre navnet tilbake til printDetails for å fikse dette.~~

~~Kjør programmet og sjekk at alt fungerer som før.~~

Vi har nå et program som kaller printDetails på alle typer produkter og som tvinger alle subklasser til å implementere metoden. Dette gjøres ved å bruke en klasse markert som abstract og en metode markert som abstract.

# Oppgave 2
~~Fjern alle andre metoder i Product, bortsett fra printDetails.~~

~~Hvis du har gettere og setter for productId og price, fjern dem. Hvis du bruker dem andre steder, legg dem istedet til Book og Movie-klassene.~~

Du skal nå ha en Product-klasse som er abstract, med kun abstrakte metoder (printDetails). Slik:

public abstract class Product {
protected long productId;
protected int price;

    public abstract void printDetails();
}
En klasse som er abstract og kun har abstrakte metoder ligner på et interface. La oss se hva som må til for å endre Produkt-klassen til et interface.

Dette vil gjøre det mulig å håndtere alle produkter på en generell, måte, men vi vil ikke kunne legge til productId og price-variabler til et interface.

Hint:

~~Endre abstract class i Product til interface slik:~~

public interface Product
Fjern variablene fra Product-klassen og legg dem til Book og Movie.

Du kan ikke arve fra Product lenger i Book og Movie siden det ikke er en klasse lenger. Du må nå implementere Product med nøkkelordet implements:

public class Book implements Product {
Prøv å kjør programmet. Det skal fungere og som du kan se er det fortsatt ok å håndtere produkter som typen Product, selv om dette nå er et interface og ikke en klasse.

Et interface er en form for kontrakt som tvinger klassen som implementerer det til å oppfylle kontrakten - dvs. at den må implementere alle metodene det definerer.

# Oppgave 3
Vi skal nå bruke et eksisterende interface for å bruke en metode i klassen Collections som hjelper å sortere objekter i en liste.

Siden Product nå er et interface, så vil vi her kun sortere en liste av Movie-objekter.

Legg til noen filmer til en liste og legg dem til i en rekkefølge som ikke er avhengig av productId.

Du kan legge til alle Movie-objektene fra denne listen til produkt-listen ved å bruke metoden addAll:

List<Movie> movies = new ArrayList<>();
movies.add(ghostBusters);
movies.add(shawshank);
movies.add(lordOfTheRings);

products.addAll(movies);
For å bruke metoden sort i Collections-klassen, legg til denne linjen:

Collections.sort(movies);
Som du vil se så vil ikke denne metoden akseptere vår liste med filmer siden den forventer en liste med Comparable. Comparable er et interface som tvinger klasser som implementerer det til å implementere metoden compareTo. Ved å definere metoden sort til å ta en liste med Comparable, så vet metoden at den alltid kan kalle compareTo på alle objektene i listen.

Interfacet Comparable trenger typen til klassen på samme måten som List eller Map, slik: Comparable<Movie>.

La vår Movie-klasse implementere Comparable i tillegg til Product. En klasse kan implementere mange interfaces ved å separere dem med komma:

public class Movie implements Product, Comparable<Movie> {
IntelliJ vil nå indikere at Movie-klassen må implementere compareTo for å oppfylle kontrakten til Comparable.

La oss gjøre dette ved å legge til metoden:

@Override
public int compareTo(Movie movie) {
Denne metoden returnerer en int. La den være 0 hvis productId er lik productId i Movie-parameteren. Den skal være -1 hvis den er mindre enn productId i Movie-parameteren, og ellers 1.

Dette er implementasjonen av compareTo. Den returner -1, 0 eller 1 for å indikere om objektet skal anses som mindre enn, lik eller større enn objektet som sendes til metoden.

Prøv å implementer denne funksjonaliteten. Kommenter ut Collections.sort og sammenlign resultatet med og uten sortering.