package com.example.HomeTaskSeven

//Atividade 3
//1. Crie um singleton chamado UtilityHelper
object UtilityHelper {
    //2. Crie uma propriedade privada do tipo do enum criada na atividade anterior
// chamada CurrentDay
//3. Inicialize o valor de CurrentDay com Sunday
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    // 4. Crie um metodo setCurrentDay que altera o valor da propriedade de currentDay
 fun setCurrentDay(newCurrentDay: DayOfWeek){
     this.currentDay = newCurrentDay
 }
//5. Crie um Metodo isWeekend que retorna verdadeiro quando o valor de currentDay eh sabado ou domingo

    fun isWeekend(){
        when(currentDay){
            DayOfWeek.SUNDAY -> println(true)
            DayOfWeek.SATURDAY -> println(true)
            else -> println(false)
        }
    }
}
//Atividade 4
fun main(){
    //1.Pegue uma instancia de singleton que criamos anteriormente
//2. Use metodo setCurrentDay e altere o dia de semana para segunda feira
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
//3.Chame o metodo isWeekend e confira se ele esta retornado falso
    UtilityHelper.isWeekend()
    //4.Pegue uma nova instancia do SingleTon e usando o setCurrentDay altere o dia atual para domingo
    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
//5.Chame o metodo isWeekend e confira se agora ele esta retornando verdadeiro
    UtilityHelper.isWeekend()
}