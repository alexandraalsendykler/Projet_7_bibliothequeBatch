3) Cloner le répertoire GitHub

4) Se placer dans le répertoire du projet Maven, là où se trouve le pom.xml. Lancer la commande mvn eclipse:eclipse.

5) Importer le projet en faisant : Import > Existing Maven Projects > Browse > Select file > Finish 

6) Ouvrir le fichier application.properties et rentrer les données ci-dessous (au besoin adapter avec vos propres informations de connexion) :

server.port=8181

com.bibliotheque.batch.apiUrl=http://127.0.0.1:9001

spring.mail.host=smtp.gmail.com

spring.mail.port=587

spring.mail.username=<relance.pret.bibliotheque.oc@gmail.com>

spring.mail.password= (à demander si besoin)

spring.mail.properties.mail.smtp.auth=true

spring.mail.properties.mail.smtp.starttls.enable=true

7) Faire run as, lancer la commande spring-boot : run

8) Pour afficher le site rendez-vous sur http://localhost:9001/
