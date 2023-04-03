
-- remove all existing orders
-- DELETE FROM orders;

-- remove all test orders for one customer
DELETE FROM orders WHERE customer_id = 3;

-- remove all test orders for a set of customers
DELETE FROM orders WHERE customer_id IN (3, 4, 5);

-- remove all test orders for a set of customers
DELETE FROM orders WHERE customer_id IN (SELECT id FROM customers WHERE last_name LIKE '%TEST%');
