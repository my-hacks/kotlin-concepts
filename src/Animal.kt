abstract class Animal(
		private val name: String,
		val legCount: Int = 4
) {
	//similar to onInit in Angular
	init {
		println("Hello my name is $name")
	}
	
	abstract fun makeSound()
}

//A classe animal pode ser considerada uma classe abstrata por que nao é necessario instanciar um animal sem que se passe o tipo dele,
//desta forma animais tambem emitem som, logo é possivel criar metodos abstratos que serao sobrescritos nas classes filhas
//que herdarem de animal

//funcoes abstratas nao sao implementadas na classe e sim nas classe que herdarem dela