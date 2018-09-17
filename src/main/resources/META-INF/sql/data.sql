INSERT INTO TOPICS (ID,TOPIC_NAME) values (1, 'Ocean wild life');
INSERT INTO TOPICS (ID,TOPIC_NAME) values (2, 'Dinosaurs');
INSERT INTO TOPICS (ID,TOPIC_NAME) values (3, 'Big cats');
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (1, 'The biggest fish in the world is',1);
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (2, 'The fastest fish in the world is',1);
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (3, 'Which fish is cartilaginous?',1);
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (4, 'Which fish is the most poisonous?',1);
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (5, 'Which dinosaur used to live in the sea?',2);
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (6, 'Which one of the dinosaurs is the biggest one?',2);
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (7, 'Which dinosaur is the first one to be discovered?',2);
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (8, 'Which one of the dinosaurs could fly?',2);
INSERT INTO QUESTIONS (ID,QUESTION,TOPIC_ID) VALUES (9, 'Which cat is the biggest one?',3);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (1, 'whale shark',TRUE,1);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (2, 'blue shark',FALSE,1);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (3, 'white shark',FALSE,1);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (4, 'whale catfish',FALSE,1);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (5, 'sailfish',TRUE,2);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (6, 'swordfish',FALSE,2);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (7, 'atlantic blue marlin',FALSE,2);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (8, 'tarpon',FALSE,2);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (9, 'Stingray',TRUE,3);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (10, 'Salmon',FALSE,3);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (11, 'Sturgeon',FALSE,3);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (12, 'Barracuda',FALSE,3);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (13, 'Reef stonefish',TRUE,4);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (14, 'Dogfish',FALSE,4);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (15, 'Sea devil',FALSE,4);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (16, 'Wolffish',FALSE,4);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (17, 'Mosasaurus',TRUE,5);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (18, 'Triceratops',FALSE,5);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (19, 'Iguanodon',FALSE,5);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (20, 'Ankylosaurus',FALSE,5);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (21, 'Spinosaurus',TRUE,6);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (22, 'Tyrannosaurus',FALSE,6);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (23, 'Tarbosaurus',FALSE,6);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (24, 'Ceratosaurus',FALSE,6);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (25, 'Megalosaurus',TRUE,7);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (26, 'Hadrosaurus',FALSE,7);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (27, 'Stegosaurus',FALSE,7);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (28, 'Diplodocus',FALSE,7);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (29, 'Pterosaur',TRUE,8);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (30, 'Brontosaurus',FALSE,8);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (31, 'Styracosaurus',FALSE,8);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (32, 'Indricothere',FALSE,8);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (33, 'Tyger',TRUE,9);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (34, 'Lion',FALSE,9);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (35, 'Leopard',FALSE,9);
INSERT INTO ANSWERS (ID,ANSWER,CORRECT,QUESTION_ID) VALUES (36, 'Jaguar',FALSE,9);
INSERT INTO USERS (LOGIN,PASSWORD,NAME,ADMIN_STATUS) VALUES ('admin', 'admin','Administrator',true);
INSERT INTO USERS (LOGIN,PASSWORD,NAME,ADMIN_STATUS) VALUES ('popandopalo', '1234','Popandopalo P. P.',false);
INSERT INTO USERS (LOGIN,PASSWORD,NAME,ADMIN_STATUS) VALUES ('sasha', '1234','Bardas Oleksandr',false);
INSERT INTO ATTEMPTS (ID,LOGIN,DATE,RESULT) VALUES (1, 'sasha','2018-04-06 20:50:01.042765',66.666667);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (1, 'The biggest fish in the world is','whale shark',TRUE,1);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (2, 'The fastest fish in the world is','swordfish',FALSE,1);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (3, 'Which fish is cartilaginous?','Sturgeon',FALSE,1);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (4, 'Which fish is the most poisonous?','Reef stonefish',TRUE,1);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (5, 'Which dinosaur used to live in the sea?','Mosasaurus',TRUE,1);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (6, 'Which one of the dinosaurs is the biggest one?','Spinosaurus',TRUE,1);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (7, 'Which dinosaur is the first one to be discovered?','Hadrosaurus',FALSE,1);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (8, 'Which one of the dinosaurs could fly?','Pterosaur',TRUE,1);
INSERT INTO GIVEN_ANSWERS (ID,QUESTION,GIVEN_ANSWER,CORRECT,ATTEMPT_ID) VALUES (9, 'Which cat is the biggest one?','Tyger',TRUE,1);