SELECT u.username, u.password, u.rol_id FROM users u 
UNION
SELECT ua.username, ua.password, ua.rol_id FROM usersadmin ua 
