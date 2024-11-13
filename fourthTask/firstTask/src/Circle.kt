class Circle(val center: Point, val radius: Double) {

    override fun toString(): String {
        return "Центр окружности: (${center.x}, ${center.y}), Радиус: $radius"
    }
}
