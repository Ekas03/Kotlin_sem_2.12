import kotlin.math.PI

open class Figure(_name: String) {
    val name: String
    init{
        name = _name
    }

    open fun volume(): Double {
        return 0.0
    }

    open fun orthogonalUp(): Double {
        return 0.0
    }

    open fun orthogonalSide(): Double {
        return 0.0
    }

}

class Cone(_height: Double?, _base: Double?) : Figure("конус") {
    val height: Double
    val base: Double
    init {
        height = _height!!
        base = _base!!
    }
    override fun volume() : Double {
        return 1/3 * PI * base/2 * base/2 * height // base - диаметр окружности
    }

    override fun orthogonalUp() : Double {
        return PI * base/2 * base/2 // Площадь основания
    }

    override fun orthogonalSide() : Double {
        return 1/2 * height * base // Площадь боковой стороны
    }

}

class Cub(_height: Double?, _base: Double?) : Figure("куб") {
    val height: Double
    val base: Double
    init {
        height = _height!!
        base = _base!!
    }
    override fun volume() : Double {
        return height * height * height;
    }

    override fun orthogonalUp() : Double {
        return height * height // Площадь основания
    }

    override fun orthogonalSide() : Double {
        return height * height // Площадь боковой стороны
    }
}

class Pyramid(_height: Double?, _base: Double?) : Figure("пирамида") {
    val height: Double
    val base: Double
    init {
        height = _height!!
        base = _base!!
    }

    override fun volume () : Double {
        return 1/3 * base * base * height // Считаем, что пирамида с квадратом в основании :)
    }

    override fun orthogonalUp() : Double {
        return base * base // Площадь основания
    }

    override fun orthogonalSide() : Double {
        return 1/2 * height * base // Площадь боковой стороны
    }

}

fun main() {
    println("Введите тип фигуры: конус/куб/пирамида: ")
    val type = readLine()

    println("Введите высоту фигуры: ")
    val height = readLine()?.toDouble()

    println("Введите основание/диаметр фигуры: ")
    val base = readLine()?.toDouble()

    val figure: Figure
    figure = when {
        (type == "конус") -> Cone(height, base)
        (type == "куб") -> Cub(height, base)
        (type == "пирамида") -> Pyramid(height, base)
        else -> throw IllegalArgumentException("Такого типа нет!")
    }

    println("Объем ${figure.name}: ${figure.volume()}")
    println("Площадь боковой проекции: ${figure.orthogonalUp()}")
    println("Площадь проекции сверху: ${figure.orthogonalSide()}")

}