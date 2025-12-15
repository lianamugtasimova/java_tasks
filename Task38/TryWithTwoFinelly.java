// нельзя использовать два finally блока
/*
try {
    System.out.println("try");
} finally {
    System.out.println("first finally");
} finally {
    System.out.println("second finally");
}
*/
// Ошибка компиляции: Multiple finally blocks

/*
Объяснение:
Конструкция try с двумя блоками finally НЕ допустима.
У одного блока try может быть только ОДИН блок finally.
*/
