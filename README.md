TechDay#7 : Arquillian, real tests
======================================

Utilisation d'Arquillian avec Glassfish 3.1
Ressources / Liens :
- http://arquillian.org/
- http://blog.zenika.com/index.php?post/2012/02/28/Tester-une-application-JavaEE-avec-Arquillian

Phase 1 : Déclaration des dépendances
- pom.xml

Phase 2 : création d'une classe de test simple
- ArquillianTest.java
=> Run tests

Phase 3 : configuration basique (database)
- arquillian.xml : configuration arquillian
- glassfish-resources-test.xml : configuration glassfish
- ArquillianTest.java : mise à jour du test
=> Run tests

Sortie

INFOS: command add-resources parameters[Ljava.lang.String;@476b0ae6 result: PlainTextActionReporterSUCCESSDescription: add-resources AdminCommandnull
    JDBC connection pool jdbc/JeeDemoTestPool created successfully.
    JDBC resource jdbc/JeeDemoTestDS created successfully.


Phase 4 : création d'une entité et persistance
- User.java : modèle
- persistence.xml : configuration persistance
- UserService.java : ejb testé
- ArquillianTest.java : mise à jour des tests

