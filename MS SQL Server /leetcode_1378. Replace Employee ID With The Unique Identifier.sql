SELECT u.unique_id, e.name
FROM Employees e
FULL OUTER JOIN EmployeeUNI u ON e.id = u.id;
