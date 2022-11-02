Java 18: Øvelser - Polymorfisme og abstrakte klasser
Oppgave 1
Vi bruker Product som en superklasse. Det er to grunner til dette. Den ene er for å gjenbruke variabler og funksjonalitet. Den andre er for å håndtere bøker og filmer på en mer generell måte, som produkter. Skal det være mulig å opprette nye objekter av typen Product? Hvordan ser et produkt ut som bare er et produkt?

Hvis klassen Product kun er ment å bli brukt som en generell måte å bruke "virkelige" objekter som bøker og filmer på, og som et sted vi legger felles funksjonalitet, så burde det ikke være mulig å opprette et objekt av typen Product.

Dette kan vi forhindre ved å deklarere Product-klassen som abstract.

Er det noe annet som må endres i programmet? Hva skjer nå om vi forsøker å opprette et objekt av typen Product med new?

Hva med Book-klassen som brukes som superklasse til ChildrensBook? Bør den være abstract? Hvorfor ikke?

Oppgave 2
Det er en fordel å kunne håndtere objekter på en mer generell måte ved å referere til dem via superklassen dems. Ulempen er at man ikke har tilgang til funksjonaliteten i subklassene. Du kan caste et objekt til subklassreferansen for å aksessere metoder og variabler, men finnes det ikke en bedre måte?

Hvis en subklasse overstyrer en metode i en superklasse, så vil kall på metoden kjøre den mest spesifikke implementasjonen av metoden. Hvis objektet er en subklasse så vil metoden i subklassen kjøres, selv om referansetypen er superklassen.

Kan vi bruke denne funksjonaliteten til å skrive ut detaljer om bøker og filmer uten å teste typen med instanceof?

Hint:

~~Lag en metode, printDetails, i superklassen. Den kan skrive ut noe fra produktet, eller ingenting.~~

~~Modifiser printDetails i Book og Movie slik at de overstyrer printDetails fra superklassen (endre navnet på den slik at det er det samme).~~

~~Iterer over listen av Product, men fjern instanceof-test og casting. Kall printDetails på objektet direkte.~~

Hva skjer? Er det printDetails i Product-klassen som blir kjørt, eller er det de mer spesifikke metodene i Book eller Movie som blir kjørt?



Oppgave 3
I Movie-klassen kan vi noen ganger ha en regissør, og andre ganger ikke. Hvis det er en regissør så skriver printDetails ut denne. Hittil har vi løst dette med en if-sjekk

Kan vi gjøre dette på en annen måte ved hjelp av arv og polymorfisme?

Hint:

~~Lag en ny klasse, MovieWithDirector, som arver fra Movie. Flytt variabelen director og gettere og settere fra Movie til MovieWithDirector.~~

~~La konstruktøren kun ta productId, title, genre og price i Movie. Legg til en konstruktør i MovieWithDirector som tar de samme parameterene og også en String director.Kall superklassens konstruktør med alle parameterene, untatt director, og tilordne director-parameteren til instansvariabelen.~~

Skriv ut kun variabelene som fortsatt er i Movie-klassen i printDetails-metoden.

Skriv ut alle variabelene, inkludert director i MovieWithDirector. Du kan gjenbruke funksjonaliteten i superklassen ved å først kalle printDetails-metoden i superklassen, og så bare skrive ut director.

Hvis det er et problem med å aksessere title og genre fra MovieWithDirector må du endre tilgangsmodifikatorene fra private til protected for at subklaser av Movie skal få tilgang til disse.

Alternativt kan du aksessere verdiene ved hjelp av get-metodene.

~~Bruk MovieWithDirector i main-metoden.~~

Kjør programmet. Fungerer alt? Skriver kallet til printDetails ut de korrekte variableen. Variabelene som finnes i Movie når det er en Movie, og alle variablene, inkludert director, når det er et MovieWithDirector-objekt?

Skriver du ut recommendedAgeInfo fra ChildrensBook? Hvis ikke, legg til denne funksjonaliteten til ChildrensBook. Overstyr printDetails, bruk metoden i superklassen og skriv ut recommendedAgeInfo.

Nå skal alle de ulike typene av produkter skrive ut alle instansvariablene deres, uten bruk av if-sjekker!