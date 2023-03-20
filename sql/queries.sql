select * from tb_alunos;

select * from tb_matriculas;

select * from tb_avaliacoes_fisicas;

SELECT m.id, m.data_da_matricula, m.aluno_id, a.bairro, a.cpf, a.data_de_nascimento, a.nome 
FROM tb_matriculas m 
INNER JOIN tb_alunos a ON m.aluno_id = a.id 
WHERE a.bairro = 'Bairro Xpto';

SELECT m.*
FROM tb_matriculas m
WHERE m.aluno_id = 1;
