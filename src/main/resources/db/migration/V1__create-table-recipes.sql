CREATE TABLE recipes (
      id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
      title VARCHAR(100) NOT NULL,
      author VARCHAR(100) NOT NULL,
      difficulty VARCHAR(30) NOT NULL,
      preparation_time INT NOT NULL,
      servings INT NOT NULL,
      ingredients JSON NOT NULL,
      method JSON NOT NULL,
      created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      updated_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)