-- expired ¾ø¾Ú
alter user hr IDENTIFIED by hr;

select * from dba_users;

-- unlocked
alter user hr account unlock;

select * from dba_users;

alter user hr account unlock identified by 1234;