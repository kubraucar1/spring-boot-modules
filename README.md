# spring-boot-modules

Required Commands:
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test
kafka-console-producer.bat --broker-list localhost:9092 --topic test
-------------------------------------------------------------------------------------------------------
Sample Data:
{"Name: "John", "Age":"31", "Gender":"Male"}
{"Name: "Emma", "Age":"27", "Gender":"Female"}
{"Name: "Ronald", "Age":"17", "Gender":"Male"}
---------------------------------------------------------------------------------------------------------
kafka-console-consumer.bat --topic test --bootstrap-server localhost:9092 --from-beginning
.\bin\windows\zookeeper-server-stop.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-stop.bat .\config\server.properties

#we have to run first two commands while we are running our Spring Boot application.