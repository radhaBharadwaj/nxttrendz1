CREATE TABLE if not exists product (
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName VARCHAR(255),
    price FLOAT
);

CREATE TABLE if not exists review (
    reviewId INT PRIMARY KEY AUTO_INCREMENT,
    reviewContent VARCHAR(255),
    rating INT,
    productId INT,
    FOREIGN KEY (productId) REFERENCES product(productId)
);