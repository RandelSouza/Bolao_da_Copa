CREATE TABLE usuario(
	uid SERIAL NOT NULL,
	unome VARCHAR(50) NOT NULL,
	sexo CHAR NOT NULL,
	idade INTEGER NOT NULL,
	senha VARCHAR(50) NOT NULL,
	login VARCHAR(50) NOT NULL,
	admin boolean,
	CONSTRAINT usuario_pkey PRIMARY KEY (uid) 
);

CREATE TABLE time(
	tid SERIAL NOT NULL,
	tnome VARCHAR(50) NOT NULL,
	nome_tecnico VARCHAR(50) NOT NULL,
	imagem BYTEA,
	CONSTRAINT time_pkey PRIMARY KEY (tid) 
	
);

CREATE TABLE aposta(
	aid SERIAL NOT NULL,
	uid INTEGER NOT NULL,
	palpite_gols_time_visitante INTEGER NOT NULL,
	palpite_gols_time_casa INTEGER NOT NULL,
	empate boolean,
	pontos_usuario INTEGER,
	CONSTRAINT aposta_pkey PRIMARY KEY (aid),
	CONSTRAINT aposta_fkey FOREIGN KEY (uid) REFERENCES usuario(uid)
);

CREATE TABLE partida(
	pid SERIAL NOT NULL,
	qtd_gols_time_visitante INTEGER,
	qtd_gols_time_casa INTEGER,
	estadio VARCHAR(50) NOT NULL,
	data_partida DATE,
	hora VARCHAR(20),
	time_casa INTEGER NOT NULL,
	time_visitante INTEGER NOT NULL,
	CONSTRAINT partida_pkey PRIMARY KEY (pid),
	CONSTRAINT partida_fkey1 FOREIGN KEY (time_visitante) REFERENCES time(tid),
	CONSTRAINT partida_fkey2 FOREIGN KEY (time_casa) REFERENCES time(tid)	
);

CREATE TABLE partida_relacao_aposta(
	pid INTEGER,
	aid INTEGER,
	CONSTRAINT partida_relacao_aposta_pkey PRIMARY KEY(pid, aid),
	CONSTRAINT partida_relacao_aposta_fkey1 FOREIGN KEY (pid) REFERENCES partida(pid),
	CONSTRAINT partida_relacao_aposta_fkey2 FOREIGN KEY (aid) REFERENCES aposta(aid)
);

CREATE TABLE time_relacao_partida(
	tid INTEGER,
	pid INTEGER,
	CONSTRAINT time_relacao_partida_pkey PRIMARY KEY(tid, pid),
	CONSTRAINT time_relacao_partida_fkey1 FOREIGN KEY (tid) REFERENCES time(tid),
	CONSTRAINT time_relacao_partida_fkey2 FOREIGN KEY (pid) REFERENCES partida(pid)	
);
