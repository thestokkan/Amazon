# Oppgave 1
Vi må sjekke om productId som brukes når et Movie-objekt opprettes er korrekt.

Vi ønsker ikke at productId skal kunne være et negativt tall, men nå er det ingenting som forhindrer dette. Forsøk å opprett et Movie-objekt med et negativt tall som productId.

Løs dette problemet med å legge til en sjekk i konstruktøren til Movie, som kaster en IllegalArgumentException dersom productId er et negativt tall. Legg til en melding i exception slik at kode som fanger opp denne kan få vite hva som skjedde.

Hva skjer? Krasjer programmet?