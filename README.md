# BowlingKata
Bowling Kata

##COMMIT 1
En el primer commit s'ha creat el projecte i una classe anomenada BowlinGameTest. S'ha fet un "run" i evidentment  dona un error d'execució ja que encara no hem creat cap test només s'ha creat la classe.

##COMMIT 2
En el segon commit es crea el primer test, en aquest primer test volem crear un objecte del tipus Game. En aquest cas tenim un error no podem instanciar un objecte de la classe Game perque no existeix encara la classe game.

En aquesta pràctica es treballa amb TDD (Test Driven Development) aquesta tècnica de disseny e implementació del software es per desenvolupar a partir del test. Per tant sempre s'ha de crear primer el test, com acabem de fer en aquest commit i després es crea la classe Game com es mostrarà en el commit 3.

##COMMIT 3
En el tercer commit únicament s'ha creat la classe Game, i si ens fixem en el test anterior, fet en el commit 2, ja no dona cap error de compilació ni d'execució, si executem el test ens funciona correctament.

##COMMIT 4
El següent que es vol provar es de fer un llançament. Per tant, des de la classe del test, cridem a un mètode anomenat roll. Un altre cop ens trobem a la situació de que el mètode no existeix i per tant en el següent commit l'haurem de crear.

##COMMIT 5
En aquest commit es crea el mètode roll a la classe game, d'aquesta manera el test ja es pot executar i el test passa correctament.

##COMMIT 6
Es vol provar que el contador de punts funcioni correctament. Per tant, si fem un roll de 0 pins, el resultat que esperem es el de 0. 

Mitjançant el mètode assertEquals comparem que el resultat obtingut del mètode score sigui igual al resultat esperat que es 0. 

Evidenment, no podem executar el test fins que creem el mètode en el pròxim commit.

##COMMIT 7
Es crea el mètode score, i per defecte el return es -1. Al executar el test, el test no passa ja que el resultat esperat es 0 i l'obtingut es -1.

Fins ara, no hem implementat res de codi a la classe Game, ja que el nostre objectiu es passar el test. Però en el següent commit veurem que hem de retocar aquest mètode per poder passar el test correctament.

##COMMIT 8
Com hem dit a l'anterior commit el nostre objectiu es passar el test, i per tant fem return de 0. Un cop fet el canvi, el test s'executa correctament.

