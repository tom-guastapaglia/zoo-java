tom.guasta
#2891
MarioFrl, CactusJack13 (Bryan)

CactusJack13 (Bryan) — Aujourd’hui à 09:30
Bien joue ça
tom.guasta — Aujourd’hui à 09:52
http://doc.javassicpark.tom-guastapaglia.fr/
Overview
package index
CactusJack13 (Bryan) — Aujourd’hui à 09:53
Ptn c bien fait de fou
tom.guasta — Aujourd’hui à 09:53
yes
CactusJack13 (Bryan) — Aujourd’hui à 09:53
Moi faut qu’on mette sur la main et je refais le .jar
Est ce que avant qu’on clôture le tout tu veux essayer d’appeler les fonctions de employé étant donné qu’on appelle pas du tout la classe ou on laisse comme ça ?
tom.guasta — Aujourd’hui à 09:54
oh trop bien le truc du terminal il t'affiche la batterie quand t'en as plus bcp
Image
CactusJack13 (Bryan) — Aujourd’hui à 09:54
Uuh style ptn faut que j’arrive à le mettre
tom.guasta — Aujourd’hui à 09:54
comme tu veux je peux essayer mais faut que je regénre la javadoc après alors
CactusJack13 (Bryan) — Aujourd’hui à 09:55
Bah en soit j’ai commenté les fonctions de employé même si on s’en sert pas donc au final la java doc sera la même
tom.guasta — Aujourd’hui à 09:59
Ah ouais mais ducoup on va surement enlever des méthodes dans zoo faudra revoir le UML + JavaDoc
CactusJack13 (Bryan)
a commencé un appel qui a duré 2 heures.
— Aujourd’hui à 10:28
CactusJack13 (Bryan) — Aujourd’hui à 10:29
@MarioFrl
MarioFrl — Aujourd’hui à 11:04
Je viens de me réveiller finissez le code et je ferais l’uml
CactusJack13 (Bryan) — Aujourd’hui à 11:10
t'as fais quoi jusqu'à mtn @MarioFrl
MarioFrl — Aujourd’hui à 11:12
Alors j’ai fait l’uml avec Tom tous les constructeurs même si tu les as repris puisque je les ai également repris, la création d’animaux et les fonctions relatives aux animaux ainsi que l’accouchement et tout
CactusJack13 (Bryan) — Aujourd’hui à 11:13
nan mais je parle de cqu'on a mis sur le notion hier
je sais cque t'as fais en code mdrrrr
MarioFrl — Aujourd’hui à 11:14
J’ai avancé le readme mais pas finis
tom.guasta — Aujourd’hui à 11:15
UML :

- EMPLOYE + getNom() : String
- EMPLOYE + displayAnimauxInEnclos : String
- ZOO - displayAnimauxInEnclos : String
  Tout est sur la dev fais un pull et testez faut débugger svp
  CactusJack13 (Bryan) — Aujourd’hui à 11:18
  Image
  MarioFrl — Aujourd’hui à 11:20
  Ouais j’ai eu la même erreur, il faut fermer le projet et l’ouvrir à nouveau
  Enfin c’est ce que j’ai fait
  tom.guasta — Aujourd’hui à 11:23
  Mario ca marche ?
  tu veux pas nous rejoindre ?
  MarioFrl — Aujourd’hui à 11:24
  Ouais cv
  tom.guasta — Aujourd’hui à 11:50
  fzessd
  CactusJack13 (Bryan) — Aujourd’hui à 12:01
  Type de fichier joint : unknown
  zoo-java.jar
  29.06 KB
  MarioFrl — Aujourd’hui à 12:09
  Image
  CactusJack13 (Bryan) — Aujourd’hui à 12:09
  @MarioFrl t'as crée un nouveau read me ou tu le fais dans le readme du projet durect ?
  genre t'édite ce readme on est d'accord
  Image
  MarioFrl — Aujourd’hui à 12:10
  Dans le readme du projet mais t
  sur la branche accouchement
  tom.guasta — Aujourd’hui à 12:13
  http://uml.javassicpark.tom-guastapaglia.fr/index.html
  CactusJack13 (Bryan) — Aujourd’hui à 12:15
  🤖
  MarioFrl — Aujourd’hui à 12:17
  J'avance
  ok cv
  Il manque que le readme ?
  D'acc cv
  Je lague trop j'arrive pas a revenir dans l'appel
  Je finis le readme
  tom.guasta — Aujourd’hui à 13:13
  vous êtes dipo 15h on se rappel ?
  CactusJack13 (Bryan) — Aujourd’hui à 13:16
  Moi pour un appel nan mais dis moi cque tu veux et je te fais
  MarioFrl — Aujourd’hui à 13:29
  Ouais je peux
  tom.guasta — Aujourd’hui à 13:37
  ok mario 15h
  MarioFrl — Aujourd’hui à 14:37
  README terminé, une pépite 😉

# Bienvenue dans le zoo JavassicPark !!

Vous trouverez toutes les commandes à savoir pour vous déplacer dans le zoo et voir les fonctionnalités qu'il propose.

## Variables aléatoires

### Interface :

```
Nemo a faim, a sommeil et n'est pas en bonne santé
Emy a faim, a sommeil et n'est pas en bonne santé
Clemence a faim, a sommeil et n'est pas en bonne santé
L'enclos Voliere 1 est sale

Sophie est enceinte !
```

### Explications :

Toutes les 40 secondes un enclos devient sale et trois animaux ont faim, sommeil et sont en mauvaise santé.  
De plus il est possible qu'une femme tombe enceinte et/ou accouche et/ou pond un oeuf ou même qu'un oeuf éclot.  
Donc si le message ci-dessus s'affiche, pas de panique tout est normal.  
Pour que tout revient à la normal il faudra prendre la main de l'employé pour effectuer des actions mais on verra ça après.

## Menu Principal

### Interface :

```
11:49:04
Bienvenue dans le ZOO

1. Afficher le nombre d'animaux
2. Afficher les animaux par enclos
3. Prendre le contrôle de l'employé
Choisissez une action et appuyez sur entrer :
```

### Explications :

- Tout d'abord vous avez l'heure actuelle
- Un message de bienvenue
- Un menu à trois choix ou vous devez répondre par un chiffre compris entre 1 et 3.

## 1. Afficher le nombre d'animaux (depuis _menu principal_)

### Interface :

```
12:14:47
Il y a actuellement 16 animaux dans le ZOO !

Appuyez sur entrer pour continuer
```

### Explications :

- Il y a toujours l'heure
- Le nombre d'animaux dans le zoo
- Cliquer sur entrer pour revenir au menu principale

## 2. Afficher les animaux par enclos (depuis _menu principal_)

### Interface :

```
13:45:13
Animaux dans l'enclos Aquarium 1 :
	 - Dory
	 - Nemo
	 - Marcel
	 - Mathilde
	 - Bruce
	 - Martine
Animaux dans l'enclos Voliere 1 :
	 - Sophie
	 - Albert
	 - Emy
	 - Lucas
Animaux dans l'enclos Standard 1 :
	 - Paul
	 - Cerise
	 - Robert
	 - Jade
	 - Leo
	 - Clemence
Appuyez sur entrer pour continuer
```

### Explications :

- Il y a toujours l'heure
- Le nom des animaux par enclos
- Cliquer sur entrer pour revenir au menu principale

## 3. Prendre le contrôle de l'employé (depuis _menu principal_)

... (226 lignes restantes)
Réduire
README.md
7 Ko
Du coup on dit que le manuel c'est le readme
tom.guasta — Aujourd’hui à 14:57
j'ai un poil de retard je te récup vite mario on se termine le projet qu'on soit trql
MarioFrl — Aujourd’hui à 15:17
tqt tu me dis quand tu peux
tom.guasta
a commencé un appel.
— Aujourd’hui à 15:21
tom.guasta — Aujourd’hui à 15:33
https://docs.google.com/document/d/1F6HxuU0gpa70zCNrrI4LhzTiUDFKvwzbmjyDOjB39sY/edit?usp=sharing
Google Docs - create and edit documents online, for free.
Create a new document and edit with others at the same time -- from your computer, phone or tablet. Get stuff done with or without an internet connection. Use Docs to edit Word files. Free from Google.
http://uml.javassicpark.tom-guastapaglia.fr/index.html
http://doc.javassicpark.tom-guastapaglia.fr/
Overview
package index
MarioFrl — Aujourd’hui à 15:37
Parfait juste je lague
tom.guasta — Aujourd’hui à 15:37
okok
MarioFrl — Aujourd’hui à 15:37
Et en vrai c'est propre de fou
J'ai fini de modifier le readme
sur le gg
drive
tom.guasta — Aujourd’hui à 15:43
ok nickel t'as pu faire les modifs sur un .md aussi comme ca j le mets dans le git
MarioFrl — Aujourd’hui à 15:45

# Bienvenue dans le zoo JavassicPark !!

Vous trouverez toutes les commandes à savoir pour vous déplacer dans le zoo et voir les fonctionnalités qu'il propose.

## Variables aléatoires

### Interface :

```
Nemo a faim, a sommeil et n'est pas en bonne santé
Emy a faim, a sommeil et n'est pas en bonne santé
Clemence a faim, a sommeil et n'est pas en bonne santé
L'enclos Voliere 1 est sale

Sophie est enceinte !
```

### Explications :

Toutes les 40 secondes un enclos devient sale et trois animaux ont faim, sommeil et sont en mauvaise santé.  
De plus il est possible qu'une femme tombe enceinte et/ou accouche et/ou pond un oeuf ou même qu'un oeuf éclot.  
Donc si le message ci-dessus s'affiche, pas de panique tout est normal.  
Pour que tout revient à la normal il faudra prendre la main de l'employé pour effectuer des actions mais on verra ça après.

## Menu Principal

### Interface :

```
11:49:04
Bienvenue dans le ZOO

1. Afficher le nombre d'animaux
2. Afficher les animaux par enclos
3. Prendre le contrôle de l'employé
Choisissez une action et appuyez sur entrer :
```

### Explications :

- Tout d'abord vous avez l'heure actuelle
- Un message de bienvenue
- Un menu à trois choix ou vous devez répondre par un chiffre compris entre 1 et 3.

## 1. Afficher le nombre d'animaux (depuis _menu principal_)

### Interface :

```
12:14:47
Il y a actuellement 16 animaux dans le ZOO !

Appuyez sur entrer pour continuer
```

### Explications :

- Il y a toujours l'heure
- Le nombre d'animaux dans le zoo
- Cliquer sur entrer pour revenir au menu principale

## 2. Afficher les animaux par enclos (depuis _menu principal_)

### Interface :

```
13:45:13
Animaux dans l'enclos Aquarium 1 :
	 - Dory
	 - Nemo
	 - Marcel
	 - Mathilde
	 - Bruce
	 - Martine
Animaux dans l'enclos Voliere 1 :
	 - Sophie
	 - Albert
	 - Emy
	 - Lucas
Animaux dans l'enclos Standard 1 :
	 - Paul
	 - Cerise
	 - Robert
	 - Jade
	 - Leo
	 - Clemence
Appuyez sur entrer pour continuer
```

### Explications :

- Il y a toujours l'heure
- Le nom des animaux par enclos
- Cliquer sur entrer pour revenir au menu principale

## 3. Prendre le contrôle de l'employé (depuis _menu principal_)

... (226 lignes restantes)
Réduire
README.md
7 Ko
Tient le voilà
tom.guasta — Aujourd’hui à 15:45
merci



# Bienvenue dans le zoo JavassicPark !!

Vous trouverez toutes les commandes à savoir pour vous déplacer dans le zoo et voir les fonctionnalités qu'il propose.

## Variables aléatoires

### Interface :

```
Nemo a faim, a sommeil et n'est pas en bonne santé
Emy a faim, a sommeil et n'est pas en bonne santé
Clemence a faim, a sommeil et n'est pas en bonne santé
L'enclos Voliere 1 est sale

Sophie est enceinte !
```

### Explications :

Toutes les 40 secondes un enclos devient sale et trois animaux ont faim, sommeil et sont en mauvaise santé.  
De plus il est possible qu'une femme tombe enceinte et/ou accouche et/ou pond un oeuf ou même qu'un oeuf éclot.  
Donc si le message ci-dessus s'affiche, pas de panique tout est normal.  
Pour que tout revient à la normal il faudra prendre la main de l'employé pour effectuer des actions mais on verra ça après.

## Menu Principal

### Interface :

```
11:49:04
Bienvenue dans le ZOO

1. Afficher le nombre d'animaux
2. Afficher les animaux par enclos
3. Prendre le contrôle de l'employé
Choisissez une action et appuyez sur entrer :
```

### Explications :

- Tout d'abord vous avez l'heure actuelle
- Un message de bienvenue
- Un menu à trois choix ou vous devez répondre par un chiffre compris entre 1 et 3.

## 1. Afficher le nombre d'animaux (depuis _menu principal_)

### Interface :

```
12:14:47
Il y a actuellement 16 animaux dans le ZOO !

Appuyez sur entrer pour continuer
```

### Explications :

- Il y a toujours l'heure
- Le nombre d'animaux dans le zoo
- Cliquer sur entrer pour revenir au menu principale

## 2. Afficher les animaux par enclos (depuis _menu principal_)

### Interface :

```
13:45:13
Animaux dans l'enclos Aquarium 1 :
	 - Dory
	 - Nemo
	 - Marcel
	 - Mathilde
	 - Bruce
	 - Martine
Animaux dans l'enclos Voliere 1 :
	 - Sophie
	 - Albert
	 - Emy
	 - Lucas
Animaux dans l'enclos Standard 1 :
	 - Paul
	 - Cerise
	 - Robert
	 - Jade
	 - Leo
	 - Clemence
Appuyez sur entrer pour continuer
```

### Explications :

- Il y a toujours l'heure
- Le nom des animaux par enclos
- Cliquer sur entrer pour revenir au menu principale

## 3. Prendre le contrôle de l'employé (depuis _menu principal_)

### Interface :

```
Bienvenue Monsieur l'employé, vous voulez vous déplacer dans un enclos :
14:06:56
Merci de choisir un enclos :
0. Retour
1. Enclos : Aquarium 1
2. Enclos : Voliere 1
3. Enclos : Standard 1
```

### Explications :

- Tout d'abord vous avez l'heure actuelle
- Un message de bienvenue
- Un menu à quatre choix ou vous devez répondre par un chiffre compris entre 0 et 3.
- 0 vous ramènera au menu principal.

## Enclos : _enclos choisi_

Chaque menu des trois enclos est le même, seul le nom change, Prenons Aquarium :

### Interface :

```
14:13:09
Vous êtes dans l'enclos : Aquarium 1
Choisissez une action à effectuer sur cet enclos :
0. Retour
1. Nettoyer l'enclos
2. Examiner l'enclos
3. Nourrir les animaux de l'enclos
4. Transférer un animal
```

### Explications :

- Tout d'abord vous avez l'heure actuelle
- Un menu à cinq choix ou vous devez répondre par un chiffre compris entre 0 et 4.
- 0 vous ramènera au menu de l'employé.

## 1. Nettoyer l'enclos (depuis _menu enclos_)

### Interface :

```
14:16:59
Sortie de tous les animaux présents dans l'aquarium
Nettoyage de l'aquarium en cours
\ 99 %
Entrée des animaux dans leur enclos tout propre
Aquarium 1 propre, salinité: 10, profondeur: 2

Appuyez sur entrer pour continuer
```

### Explications

Tout est dit, il vous suffit de cliquer sur entrer pour retourner au menu de l'enclos.

## 2. Examiner l'enclos (depuis _menu enclos_)

### Interface :

```
14:20:25
Enclos Aquarium 1
0. Retour
1. Afficher les détails de l'enclos
2. Lister les animaux présents dans l'enclos
```

### Explications :

- Tout d'abord vous avez l'heure actuelle
- Un menu à trois choix ou vous devez répondre par un chiffre compris entre 0 et 2.
- 0 vous ramènera au menu enclos.

## 2.1. Afficher les détails de l'enclos (depuis _Examiner enclos_)

### Interface :

```
14:22:23
Les détails de l'enclos Aquarium 1 :
Aquarium 1: superficie: 50, animaux max: 10, nbr animaux: 0, degre propreté: 0, profondeur: 2, salinité: 10

Appuyez sur entrer pour continuer
```

### Explications :

Tout est dit, il vous suffit de cliquer sur entrer pour retourner au menu de l'enclos.

## 2.2. Lister les animaux présents dans l'enclos (depuis _Examiner enclos_)

### Interface :

```
14:23:25
Les animaux de l'enclos Aquarium 1 :
- Dory
- Nemo
- Marcel
- Mathilde
- Bruce
- Martine

Appuyez sur entrer pour continuer
```

### Explications :

Tout est dit, il vous suffit de cliquer sur entrer pour retourner au menu de l'enclos.

## 3. Nourrir les animaux de l'enclos (depuis _menu enclos_)

### Interface :

```
14:27:07
Dory a mangé
Nemo a mangé
Marcel a mangé
Mathilde a mangé
Bruce a mangé

Appuyez sur entrer pour continuer
```

### Explications :

Tout est dit, il vous suffit de cliquer sur entrer pour retourner au menu de l'enclos.

## 4. Transférer un animal (depuis _menu enclos_)

### Interface :

```
14:28:36
Choisissez un animal de l'enclos Aquarium 1 :
0. Retour
1. Dory
2. Nemo
3. Mathilde
4. Bruce
5. Martine

Appuyez sur entrer pour continuer
```

### Explications :

Il faut choisir un animal à déplacer ici entre 1 et 5.

## 4.1 Choix de l'enclos (depuis _menu transférer animal_)

### Interface :

```
14:30:50
Vous déplacer l'animal Mathilde, de l'enclos Aquarium 1. Dans quel enclos ? (⚠️ ATTENTION ⚠️ Vous avez la responsabilité de déplacer un animal dans un mauvais enclos)
0. Retour
1. Aquarium 1
2. Voliere 1
3. Standard 1
```

### Explications :

Il faut choisir un enclos pour déplacer l'animal dedans ici entre 1 et 3.

## 4.2 Validation (depuis _menu transférer animal_)

### Interface :

```
14:33:02
L'animal Mathilde sort de l'enclos Aquarium 1
L'animal Mathilde fait son entrée dans l'enclos Voliere 1
L'enclos Voliere 1 contient maintenant les animaux :
- Sophie
- Albert
- Emy
- Lucas
- Mathilde

Appuyez sur entrer pour continuer
```

### Explications :

Tout est dit, il vous suffit de cliquer sur entrer pour retourner au menu de l'enclos.

> **La visite guidée est maintenant terminée vous être libre de visiter le zoo et de vous amuser, l'équipe du zoo !**

README.md
7 Ko
