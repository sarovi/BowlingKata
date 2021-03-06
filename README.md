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

##COMMIT 9
Ara es vol provar de fer 20 rolls i tirar 1 pin a cada roll. Per tant s'obtindrà un total de 20 punts. 

Com s'ha fet anteriorment, mitjançant el mètode assertEquals es comprova que s'hagin obtingut el 20 punts.

No tenim errors de compilació perquè els mètodes que utilitzem en el test ja estavan creat de l'anterior test. 

Però si que tenim error d'execució, ja que el nostre valor esperat és 20 i el resultat obtingut és 0. Això és degut a que el test funcionava correctament quant obteniem 0 punts però no per a altres valors.

##COMMIT 10
Com hem vist en l'anterior commit s'ha de retocar el codi per tal de que els tests passin, a continuació s'explica les parts de codi canviades:

1. A la classe Game necessitem una variable anomenada score per anar contant els punt, aquesta variable anirà sumant els punts obtinguts en cada roll. D'aquesta manera el mètode score ja podrà retornar els punts correctament comptats.
2. A la classe BowlingGameTest s'ha creat un mètode setUp, on s'instancia a la classe Game. En el commit anterior per cada test teniam una instància, ara només traballarem sobre la mateixa intància i no la tindrem duplicada.

Els dos tests fets fins ara s'executen correctament.

##COMMIT 11
En aquest commit hem modificat el primer test afegint dos variables locals, una per comptar les vegades que fem roll i una per comptar el número de pins tirats en casa roll. 

##COMMIT 12
Es crea un mètode privat al test anomenat rollMany, per indicar quants rolls fem i el numero de pins tirats. Això ho fem perque s'utilitzava el mètode roll en els dos test i podem simplificar codi repetit mitjançant aquest mètode privat.

##COMMIT 13
En aquest commit simplement simplifiquem una mica el codi treient les dues variables locals del primer test i cridant el mètode rollMany passant-li com a paràmetres els números corresponents a les variables eliminades.

##COMMIT 14
Apliquem els canvis en el segon test, per tant substituim el for per el mètode rollMany.

##COMMIT 15
Ara es vol provar que al fer spare es comptin correctament els punts.

Creem el tercer test i no s'executa correctament. Anem a analitzar el perquè:

1. El mètode roll() si ens fixem calcuula la puntuació, pero el nom no ens indica això.
2. El mètode score() no calcula la puntuació, només la retorna però el nom ens indica que la calcula.

CONCLUSIÓ: El test esta mal dissenya, les responsabilitats dels mètodes no concorden amb els seus nom de capçalera.

##COMMIT 16
Adaptem el codi de la classe Game per poder passar els test.

En aquest commit modifiquem el mètode roll, per tal de poder passar el test.

##COMMIT 17
Modifiquem el mètode score(), pero al descomentar el tercer test que teniam comentat, el test ens segueix sense compilar.

Això es degut a que simplement volem adaptar el codi de la classe perquè passi el test sense tindre en compte les regles del joc quant es puntua amb un spare.

##COMMIT 18
Modifiquem el mètode score() per tal de comptabilitzar correctament, seguint les regles del joc, els punts obtinguts al fer un spare.

Al fer l'execució del test funciona correctament.

##COMMIT 19
Modifiquem el nom de la variable i del mètode score, ja que els noms de variable ens han de significar alguna cosa, no es correcta anomenar a una variable i.

##COMMIT 20
Si ens fixem amb l'anterior commit, hi havia un comentari dintre del mètode score() per mostrar que aquella condició era la condició de comptar punts si es feia un spare. Per evitar això hem creat un mètode privat anomenat isSpare.

##COMMIT 21
Si ens fixem en el tercer test, tenim un comentari per undicar que volem provar la puntuació al fer un spare. Com hem fet anteriorment, per evitar els comentaris creem un mètode privat anomenat rollSpare().

##COMMIT 22
Ara es vol provar de fer un strike, aquest és el nostre 4 test.

No ens dona errors de compilació, però si d'execució ja que no tenim en compte, al comptar els punts a la classe Game(), la puntuació d'un strike.

##COMMIT 23
En aquest commit contemplem l'opció de fer un strike en el mètode score de la classe Game().

Al modificar aquest mètode el test ja compila correctament.

##COMMIT 24
Si ens fixem en l'anterior commit la manera en que es calcula el score no es molt amigable, ja que es suma 10 a els punts de les dues següents tirades. I en el cas del spare es suma 10 a la pròxima tirada.

Per fer-ho més amigable i més entenedor, es crean dos mètodes privats anomenats spareBonus i strikeBonus.

##COMMIT 25
Com hem fet amb anterioritat, per tal de treure el comentari que ens indica que el primer if indica fer un strike, creem un mètode privat per mostrar que aquell if es fer un strike.

##COMMIT 26
Per tal de treure també el comentari en la classe del test, creem un mètode privat que es fer un rollSttrike().

##COMMIT 27
Per últim fem un cinquè test per indicar una partida on tot el que fem son strikes. 

Ens funciona correctament el test ja que tenim tota la classe Game implementada correctament.

##CONCLUSIONS
En aquesta primera pràctia s'havia de fer un test aplicant la tècnica TDD, aquesta tècnica es per fer desenvolupament de software a partir del test. Per tant primer es crean les proves al test i a mesura que tenim una prova implementem aquella nova classe, mètode o funcionalitat per tal de passar el test.  

Només s'han d'implementar les funcionalitats mínimes per passar correctament el test i que no ens doni cap error de compilació.

A mesura que ha avançat la pràcica ens hem trobat amb els següents problemes i erros:
1. Instàncies duplicades -> Si hem de traballar sobre una instància des de diferents test, no l'hem de duplicar, creem una al començar el test i treballem sobre aquesta.
2. Mètodes privats per evitar duplicats -> Si hem de fer, com en el nostre cas molts rolls amb diferents parametres, creem un mètode privat a la classe test i ens evitem fer un for per cada test, d'aquesta manera ens quedarà un codi més net i sense repetits.
3. Ens hem d'assegurar que els noms dels mètodes estiguin ben definits -> En un punt de la pràcica ens hem trobat en que el metode score només feia un return pero no comptabilitzava els punts per exemple.
4. Els noms de les variables han de ser significatius.
5. Evitar comentaris dintre dels mètodes -> En el nostre cas teniam un comentari per indicar que un if era la condició de fer spare, ho hem solventat mitjançant un mètode privat.
6. Evitar comentaris dintre dels tests -> Com en el punt anterior també ho podem solventar amb mètodes privats.
7. Evitar expresions dificils d'entendre -> Per exemple al hora de comptar els punts per un strike l'operació es feia llarga i dificil de llegir, per evitar això hem creat un mètode privat.
