import kotlin.math.sqrt

class Triangle(val p1: Point, val p2: Point, val p3: Point) {


    private fun calculateCircumcenter(): Point {
        val dA = p1.x * p1.x + p1.y * p1.y
        val dB = p2.x * p2.x + p2.y * p2.y
        val dC = p3.x * p3.x + p3.y * p3.y

        val aux1 = (dA * (p3.y - p2.y) + dB * (p1.y - p3.y) + dC * (p2.y - p1.y))
        val aux2 = -(dA * (p3.x - p2.x) + dB * (p1.x - p3.x) + dC * (p2.x - p1.x))
        val div = (2 * (p1.x * (p3.y - p2.y) + p2.x * (p1.y - p3.y) + p3.x * (p2.y - p1.y)))

        val centerX = aux1 / div
        val centerY = aux2 / div

        return Point(centerX, centerY)
    }


    private fun calculateCircumradius(): Double {
        val a = distance(p1, p2)
        val b = distance(p2, p3)
        val c = distance(p3, p1)
        val s = (a + b + c) / 2
        val area = sqrt(s * (s - a) * (s - b) * (s - c))
        return (a * b * c) / (4 * area)
    }

    private fun distance(p1: Point, p2: Point): Double {
        return sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y))
    }


    fun getCircumcircle(): Circle {
        val center = calculateCircumcenter()
        val radius = calculateCircumradius()
        return Circle(center, radius)
    }
}
