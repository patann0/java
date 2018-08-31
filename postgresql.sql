create table Ajust(id integer primary key,name varchar,logdata timestamp,aaa text);

insert into Ajust(id,name,logdata,aaa)values(1,'a','Oct,2018,21','file01');
insert into Ajust(id,name,logdata,aaa)values(2,'bb','Dec,2011,10','file02');
insert into Ajust(id,name,logdata,aaa)values(3,'ccc','May,2015,5','file03');
insert into Ajust(id,name,logdata,aaa)values(4,'dddd','Sep,2016,4','file04');
insert into Ajust(id,name,logdata,aaa)values(5,'eeeee','Nov,2017,11','file05');

select * from Ajust;
