select distinct p1.Email from Person p1
where (select count(p2.Id) from Person p2 where p2.Email = p1.Email having count(p2.Id) > 1);