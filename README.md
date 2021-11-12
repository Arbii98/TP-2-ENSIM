TP 2 :
	Etape 5 :
		WEB : 
		JPA : Java Persistance API est une specification JavaEE et un sous projet de Spring DATA qui permet l'acces aux données (BDD) 
		Hibernate : Fournisseur d'ORM (Object-Relational-Mapping)
		H2 : Une base de données en memoire de l'application, à chaque redémarrage et se ré-initialise.
		DevTools : Est un "Set of tools" additionnel pour aider au developpement (Par exemple: relancer l'application à chaque modification du code)
		Thymeleaf : Est un moteur de template qui a pour but de génerer les vues des applications Web basées sur MVC

	Etape 13 : 
		1) L'annotation @GetMapping nous permet de définir l'URL 
		2) Le return de la methode du controlleur permet de choisir le nom de la View
		3) On utilise les models pour assurer la communication entre le Controller et la View

	Etape 17 :
		Une nouvelle table appelée ADRESSE à été crée en lançant l'application

	Etape 18 : 
		ORM (Object-Relational-Mapping) est une technique de programmation qui permet de faire la correspondance entre le monde objet et le
		relationnel. Hibernate, étant un fournisseur d'ORM est capable de scanner tous les entités JPA du projet et génére ensuite leurs tables correspondantes dans la base de données

	Etape 20 :
		En utilisant une ancienne version de SPRING, je n'ai pas rencontré de problème en lançant l'application (l'ajout des lignes de data.sql fonctionne parfaitement)

	Etape 23 : 
		L'annotation @Autowired permet d'injecter un bean spring dans un autre.

	Etape 30 :
		J'ai utiliser le CDN de bootstrap et je lui ai fait l'appel dans le fragment du


TP 4 :
	
	Etape 6 :

	1) Oui, il faut s'authentifier pour avoir une clé API pour pouvoir appeler Meteo Concept
	2) J'ai fait l'appel à ce lien : https://api.meteo-concept.com/api/forecast/daily
	3) Methode GET
	4) On passe les parametres sur l'URL, on separe le chemin et les parametres avec '?' et on separe les parametres entre eux avec '&'
	
