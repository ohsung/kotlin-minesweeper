package minesweeper.domain

enum class CoordinateDirection(
    val x: Int,
    val y: Int,
) {
    RIGHT(1, 0),
    LEFT(-1, 0),
    UP(0, 1),
    DOWN(0, -1),
    RIGHT_UP(1, 1),
    RIGHT_DOWN(1, -1),
    LEFT_UP(-1, 1),
    LEFT_DOWN(-1, -1),
    ;

    companion object {
        fun around(coordinate: Coordinate): List<Coordinate> = values().map {
            Coordinate(coordinate.x + it.x, coordinate.y + it.y)
        }
    }
}
