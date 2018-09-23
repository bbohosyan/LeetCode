select class from(
select class, count(student) from (
select distinct c1.student, c1.class from courses c1) q
group by class
having count(student) >= 5) w;