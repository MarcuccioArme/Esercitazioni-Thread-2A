# Esercitazioni-Thread-2A
### Alcuni esercizi per capire i Thread

## Esercizio 1:
Creare un pool di thread ognuno dei quali va in sleep per un periodo casuale di millisecondi compreso tra 0 e 5000.

Ogni thread, prima di effettuare la sleep, stampa a video:
- il proprio nome (passato al momento della creazione)
- il numero di millisecondi di durata della sleep

Al termine della sleep, stampa un messaggio di avvenuta conclusione.
<br> Il main, dopo aver passato al pool i job da eseguire, stampa a video una stringa di avvenuta terminazione.
<br> Il numero di job creati è un parametro da fornire in input.

### NOTA: 
per generare numeri casuali, usare la classe java.util.Random e il metodo "nextInt(int)".

## Esercizio 2:
In una sala cinematografica la vendita dei biglietti viene effettuata tramite più casse.
<br> Il numero dei posti disponibili è memorizzato nella variabile “posti”, inizializzata al valore 200.
<br> Ogni volta che una cassa vende un biglietto, la variabile posti deve essere decrementata.

Progettare un algoritmo in grado di gestire le diverse casse, che accedono in modo concorrente alla variabile “posti”.
