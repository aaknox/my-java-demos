CREATE PROCEDURE INSERT_CELEBRITY(
    FIRSTNAME CHARACTER VARYING,
    LASTNAME CHARACTER VARYING,
    STAGENAME CHARACTER VARYING,
    GENDER CHARACTER VARYING)
LANGUAGE SQL
AS $$
INSERT INTO CELEBRITY(C_FIRST_NAME, C_LAST_NAME, C_STAGE_NAME, C_GENDER) VALUES (FIRSTNAME, LASTNAME, STAGENAME, GENDER);
$$;


CALL INSERT_CELEBRITY('ANNE', 'HATHAWAY', 'ANNE HATHAWAY','F');


SELECT * FROM CELEBRITY; 