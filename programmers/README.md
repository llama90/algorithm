# Level Test

![level 1](./img/level_test_1.png)

For beginners, The problems can be solved with basic programming skills. That contains `strings`, `implementation`, `sort`. Sometimes it can come out `greedy` and `hash`.

* Time Limit: 40 minutes
* Pass Rate: 28.5 %
* Average Complete Time: 27.5 minutes
* Average Score: 42.9 score


# Practice

## Algorithm

## SQL

### SELECT
![SQL SELECT](./img/practice_sql_select.png)

```sql
-- 1. select all
SELECT * FROM ANIMAL_INS;
-- 2. order by desc
SELECT NAME, DATETIME FROM ANIMAL_INS ORDER BY ANIMAL_ID DESC;
-- 3. where condition ==
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION = 'Sick' ORDER BY ANIMAL_ID ASC;
-- 4. where condition !=
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION != 'Aged' ORDER BY ANIMAL_ID ASC;
-- 5. order by asc
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS ORDER BY ANIMAL_ID ASC;
-- 6. order by multi condition
SELECT ANIMAL_ID, NAME, DATETIME FROM ANIMAL_INS ORDER BY NAME ASC, DATETIME DESC;
-- 7. select top n
SELECT NAME FROM ANIMAL_INS ORDER BY DATETIME ASC LIMIT 1;
```

### SUM, MAX, MIN
![SQL SUM, MAX, MIN](./img/practice_sql_sum_max_min.png)

```sql
-- 1. select max
SELECT MAX(DATETIME) FROM ANIMAL_INS;
-- 2. select min
SELECT MIN(DATETIME) FROM ANIMAL_INS;
-- 3. select count
SELECT COUNT(*) FROM ANIMAL_INS;
-- 4. remove duplicate column
SELECT COUNT(DISTINCT NAME) FROM ANIMAL_INS;
```

### GROUP BY
![SQL SUM, MAX, MIN](./img/practice_sql_group_by.png)

```sql
-- 1. group by
SELECT ANIMAL_TYPE, COUNT(*) FROM ANIMAL_INS GROUP BY ANIMAL_TYPE ORDER BY ANIMAL_TYPE ASC;
-- 2. group by with having
SELECT NAME, COUNT(*) FROM ANIMAL_INS WHERE NAME != "" GROUP BY NAME HAVING COUNT(*) > 1 ORDER BY NAME ASC;
-- 3. group by with datetime 
SELECT HOUR(DATETIME), COUNT(*) 
FROM ANIMAL_OUTS 
WHERE HOUR(DATETIME) > 08 AND HOUR(DATETIME) < 20 
GROUP BY HOUR(DATETIME) 
ORDER BY HOUR(DATETIME) ASC;
-- 4. group by with datetime with variable
SET @HOURS = -1;
SELECT 
    (@HOURS := @HOURS + 1) AS 'HOUR',
    (
        SELECT COUNT(*) 
        FROM ANIMAL_OUTS 
        WHERE HOUR(DATETIME) = @HOURS
    ) AS 'COUNTS' 
FROM ANIMAL_OUTS
WHERE @HOURS < 23;
```