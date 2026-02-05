# Taller Persistencia

## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back

## Análisis de Diseño

- Ambas tienen la llave foranea, ya que heredan el mismo id

- Utilice OrphanRemoval, el cual elimina todas las clases hijas de otra, al eliminar la clase padre. La diferencia es que eliminarlo de la lista no asegura que se borre, sino que puede quedar en null.

- Select **Nombre de Columna**: Busca los valores de esas columnas. From **Nombre de tabla**: Busca en la tabla ingresada. Where **condicion**: Filtra por la condicion ingresada.