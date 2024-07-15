package board_test.board.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardEntityRepository extends JpaRepository<BoardEntity, Long> {
}
