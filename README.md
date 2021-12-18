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
  

## 1. Afficher le nombre d'animaux (depuis *menu principal*)

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


## 2. Afficher les animaux par enclos (depuis *menu principal*)

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


## 3. Prendre le contrôle de l'employé (depuis *menu principal*)

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


## Enclos : *enclos choisi*

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


## 1. Nettoyer l'enclos (depuis *menu enclos*)

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


## 2. Examiner l'enclos (depuis *menu enclos*)

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


## 2.1. Afficher les détails de l'enclos (depuis *Examiner enclos*)

### Interface :

```
14:22:23
Les détails de l'enclos Aquarium 1 : 
Aquarium 1: superficie: 50, animaux max: 10, nbr animaux: 0, degre propreté: 0, profondeur: 2, salinité: 10

Appuyez sur entrer pour continuer
```

### Explications :

Tout est dit, il vous suffit de cliquer sur entrer pour retourner au menu de l'enclos.


## 2.2. Lister les animaux présents dans l'enclos (depuis *Examiner enclos*)

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


## 3. Nourrir les animaux de l'enclos (depuis *menu enclos*)

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


## 4. Transférer un animal (depuis *menu enclos*)

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


## 4.1 Choix de l'enclos (depuis *menu transférer animal*)

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


## 4.2 Validation (depuis *menu transférer animal*)

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


>__La visite guidée est maintenant terminée vous être libre de visiter le zoo et de vous amuser, l'équipe du zoo !__

