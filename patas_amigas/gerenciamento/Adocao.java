package patas_amigas.gerenciamento;

public class Adocao {   
    /*

--> Tutor é o dono atual do animal (quem coloca pra adoção), Adotante é quem está interessado no Animal

--> o ex Tutor, se ainda tiver animais sob custódia, continuará sendo Tutor. Se não, não estará ativo (soft delete).
--> criar isAtivo em Tutor e Adotante (soft delete)

--> todo Animal pode ter um Tutor, mesmo antes da adoção. Se o Animal já tiver um Tutor, a gente usa o isParaAdocao.
--> com Animal de rua (se não fosse cadastrar quem levou o Animal), aí daria certo verificar se o objeto Tutor dentro do Animal está vazio.

--> juntar Adotante e Tutor - Dono
--> entra como Pessoa (genérico) - o ID do Dono (se aceito) vai para o Animal.
--> objeto relacional pro histórico pra criar a relação entre o Animal em adoção e os Tutores (o atual e o novo).
    */
}
