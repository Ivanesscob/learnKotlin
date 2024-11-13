import kotlin.math.sqrt

class Triangle(val p1: Point, val p2: Point, val p3: Point) {


    private fun sideLength(p1: Point, p2: Point): Double {
        return sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y))
    }


    private fun perimeter(): Double {
        val a = sideLength(p1, p2)
        val b = sideLength(p2, p3)
        val c = sideLength(p3, p1)
        return a + b + c
    }


    private fun incenter(): Point {
        val a = sideLength(p2, p3)
        val b = sideLength(p1, p3)
        val c = sideLength(p1, p2)
        val px = (a * p1.x + b * p2.x + c * p3.x) / (a + b + c)
        val py = (a * p1.y + b * p2.y + c * p3.y) / (a + b + c)
        return Point(px, py)
    }


    private fun inradius(): Double {
        val a = sideLength(p2, p3)
        val b = sideLength(p1, p3)
        val c = sideLength(p1, p2)
        val s = perimeter() / 2
        val area = sqrt(s * (s - a) * (s - b) * (s - c))
        return area / s
    }


    fun inscribedCircle(): Circle {
        val center = incenter()
        val radius = inradius()
        return Circle(center, radius)
    }
}