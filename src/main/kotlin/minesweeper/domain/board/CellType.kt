package minesweeper.domain.board

enum class CellType {
    MINE,
    NORMAL;

    companion object {
        fun of(isMine: Boolean) = if (isMine) {
            MINE
        } else {
            NORMAL
        }
    }
}
