Oppgave 1
En av metodene som alle objekter arver fra superklassen Object, er metoden toString. Denne metoden bør returnere en String som gir en god representasjon av objektet - dvs. den bør inneholde informasjon om de viktigste variablene til objektet.

Metoden toString blir automatisk kalt når et objekt blir brukt som parameter til  System.out.println.

Prøv å skriv ut et av Book-objektene ved å bruke System.out.println med et Book-objekt som parameter.

Var resultatet noe ala: com.company.Book@60e53b93?

Metoden som er arvet fra Objekt har ikke kjennskap til Book-objektet og vet ikke hvordan en god representasjon av et Book-objekt kan se ut. Den returnerer bare klassenavnet og et tall.

For at toString skal være brukbar må vi overstyre den og lage vår egen implementasjon i Book-objektet.

Overstyr toString ved å legge til en ny public metode med navnet toString i Book-klassen. Metoden skal returnere String og ikke ta noen parametere. Lag en implementasjon av metoden ved å returnere en String som inneholder verdiene til variablene i Book-objektet.

Det er god praksis og også legge til en Override-annotasjon over metodesignaturen, slik:

@Override

public String toString() { ...}
~~Prøv å skriv ut Book-objektet igjen ved å bruke det som parameter til System.out.println.~~

Det bør se litt bedre ut!



Oppgave 2
Noen bøker har spesielle krav. For barnebøker ønsker vi også å ha en aldersanbefaling.

Vi kan lage en ny klasse som heter ChildrensBook som har de samme variablene som Book og i tillegg en recommendedAgeInfo. Da vil vi ha duplisert en del kode siden alt er likt som Book, med unntak av recommendedAgeInfo.

Lag heller en ny klasse som arver fra Book. Den nye klassen har kun én variabel - recommendedAgeInfo. På denne måten må vi ikke deklarere de samme variablene på ny. Vi gjenbruker funksjonaliteten fra superklassen.

~~Oppgaven er å lage en ny klasse ChildrensBook som arver fra Book og har en private variabel recommendedAgeInfo av typen String. Denne skal også ha public getters og setters.~~

Hvis du ikke har en standardkonstruktør i Book-klassen vil du se at du enten må lage en i Book-klassen eller lage en i ChildrensBook som tilsvarer en av konstruktørene i Book.

~~Lag en konstruktør i ChildrensBook som tar title, author, price og recommendedAgeInfo som parametere. På første linjen i konstruktøren kaller du konstruktøren i superklassen med nøkkelordet super og parameterene title, author og price. Tilordne parameteren recommendedAgeInfo til instansvariabelen med samme navn.~~

~~Lag en ChildrensBook med title, author, price og recommendedAgeInfo - f.eks. "from 4 years". Legg objektet til listen av bøker. Det er ok å legge denne til listen, siden en ChildrensBook også er en Book.~~

Oppgave 3
Vi behøver en productId i Book også. Skal vi legge til en ny variabel i Book eller kan vi bruke arv for å gjenbruke kode og unngå duplisert kode?

Hvis vi sammenligner Book og Movie så ser vi at de deler mange lignende variabler. I tillegg til productId, så har vi title og price. Kanskje vi kan flytte disse til en superklasse og la Book og Movie arve fra denne? Hva skal den nye superklassen hete?

~~Lag en klasse med navnet Product. Legg til variabelen productId til denne klassen. Legg også til variabelen price, siden vi vet at alle produktene vil ha en pris. Bør vi også legge variabelen title i denne klassen? Kanskje vi ønsker å bruke denne klassen for alle produkter, men ikke alle produktene har en tittel. La title være i denne omgang, og legg bare til productId og price. Begge skal ha public getters og setters.~~

La Book arve fra Product. Vi kan fjerne gettere og settere for price, siden Book nå arver fra Product. Eller er det et problem med price-variabelen i Book-konstruktøren?

~~Hvis du deklarerte variablene i Product som private, så er de ikke tilgjengelig fra subklasser. Se hva som skjer om du endrer mellom private og protected på variablene i Product. Subklassen må ha tilgang til variablene i superklassen så vi må deklarere dem som protected i superklassen.~~

~~Nå har vi productId i Book, men ikke i Movie. La oss gjenbruke variablene i Product ved at Movie ogå arver fra denne. Fjern price og productId, og tilhørende gettere og settere for disse i Movie.~~

Ved å introdusere superklassen Product kan vi nå gjenbruke variabler som er brukt både av bøker og filmer.

~~Oppgave 4~~
Vi kan bruke arv til å gjenbruke variabler og metoder, men også til å håndtere objekter på en mer generell måte.

Vi behøver ikke å ha to forskjellige lister, en med bøker og en med filmer - siden begge nå er produkter.

~~Lag heller en liste med produkter og legg til alle bøker og filmer til samme listen. Siden de begge arver fra Product kan de bli lagt til en generisk liste av typen Product.~~

~~Lag en ny for-each-løkke for å iterere over produkt-listen og fjern de andre løkkene som itererte over filmer og bøker. Bruk den nye løkken til å skrive ut informasjon om bøker og filmer.~~

Hvordan aksesserer vi nå printBookDetails eller printMovieDetails på Product? Du kan iterere over elementene og hente hvert produkt, men du kan bare aksessere variabler og metoder som er deklarert i Product-klassen. Metodene er der, de er bare ikke aksesserbare lengre siden referansetypen nå er Product.

For å aksessere metoder som kun er i Movie eller Book må vi caste Product til Book eller Movie, men hvordan vet vi om et Product er en Book eller en Movie?

Prøv å cast hvert Product til Book for å aksessere printBookDetails. Hvis du har en Movie i listen vil du få en ClassCastException når du prøver å caste en Movie til en Book.

Du kan løse dette ved å først sjekke objektet ved hjelp av operatoren instanceof, slik:

if (product instanceof Book) {
Book book = (Book)product;
book.printBookDetails();
}
Ved å sjekke om variabelen egentlig er en Book, kan du trygt caste til Book og kalle printBookDetails.

~~Bruk else-if for å sjekke om objektet er en Movie, og cast det i så tilfelle til en Movie og skriv ut detaljene om filmen.~~