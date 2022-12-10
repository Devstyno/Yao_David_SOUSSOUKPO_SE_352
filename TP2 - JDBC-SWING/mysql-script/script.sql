create database federation;
use federation;

create table joueur(
joueurId int not null primary key auto_increment,
nom varchar(255) not null,
prenom varchar(255) not null,
numeroLicence varchar(255) not null,
nombrePoints int not null
) engine = innodb;

create table match_(
matchId int not null primary key auto_increment,
joueur1 int not null,
joueur2 int not null,
vainqueur int not null,
foreign key (joueur1) references joueur(joueurId),
foreign key (joueur2) references joueur(joueurId),
foreign key (vainqueur) references joueur(joueurId)
) engine = innodb;