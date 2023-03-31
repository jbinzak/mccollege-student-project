-- update city for all test customers
UPDATE customers SET city = 'Chicago' WHERE last_name LIKE '%TEST%';

-- update password for all test password customers
UPDATE customers SET password = 'password123' WHERE last_name LIKE '%PWD%';