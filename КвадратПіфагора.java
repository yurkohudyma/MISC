package PifagorQuadrat;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//В ДАНОМУ КОДІ ВСІ УКР ЛІТЕРИ Іі замінені на англ Ii
public class КвадратПіфагора {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Введiть дату народження (ДДММРРРР):");
		int date = getDate();
		String date_String = date+"";
		System.out.println(date_String);
		while (log(date) != 8) {
			System.out.println("Неповна дата, ви ввели лише " + log(date) + " цифри з необхiдних 8");
			date = getDate();
		}
		//String date_String = date+"";//(new StringBuilder(String.valueOf(date))).toString(); ЗВОРОТНЯ КОМПІЛЯЦІЯ ТАКЕ НАВАЯЛА
		calculate(date_String);
		sc.close();
	}

	private static int getDate() {
		while (!sc.hasNextInt()) {
			System.out.println("Ви ввели не число");
			sc.next();
		}
		int date = sc.nextInt();
		return date;
	}

	private static int log(int entry) {
		int x = (int) Math.log10(entry) + 1;
		return x;
	}

	private static void calculate(String date_String) {
		int num1 = 0;
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			arr.add(date_String.substring(i, i + 1));
			num1 += Integer.parseInt(arr.get(i));
		}
		String num_s = num1+"";//(new StringBuilder(String.valueOf(num1))).toString();
		arr.add(num_s.substring(0, 1));
		if (num1 >= 10)
			arr.add(num_s.substring(1, 2));
		int num2 = Integer.parseInt(num_s.substring(0, 1)) + Integer.parseInt(num_s.substring(1, 2));
		String num2_s = num1+"";//(new StringBuilder(String.valueOf(num2))).toString();
		arr.add(num2_s.substring(0, 1));
		if (num2 >= 10)
			arr.add(num2_s.substring(1, 2));
		int num3 = num1 - 2 * Integer.parseInt(arr.get(0));
		String num3_s = num3+"";//(new StringBuilder(String.valueOf(num3))).toString();
		arr.add(num3_s.substring(0, 1));
		if (num3 >= 10)
			arr.add(num3_s.substring(1, 2));
		int num4 = Integer.parseInt(num3_s.substring(0, 1)) + Integer.parseInt(num3_s.substring(1, 2));
		String num4_s = (new StringBuilder(String.valueOf(num4))).toString();
		arr.add(num4_s.substring(0, 1));
		if (num4 >= 10)
			arr.add(num4_s.substring(1, 2));
		hold();
		System.out.println("");
		System.out.println(arr.toString());
		HashMap<Integer, Integer> hash = new HashMap<>();
		int c1 = 1;
		int c2 = 1;
		int c3 = 1;
		int c4 = 1;
		int c5 = 1;
		int c6 = 1;
		int c7 = 1;
		int c8 = 1;
		int c9 = 1;
		for (int j = 0; j < arr.size(); j++) {
			String str;
			switch ((str = arr.get(j)).hashCode()) {
			case 49:
				if (!str.equals("1"))
					break;
				hash.put(Integer.valueOf(1), Integer.valueOf(c1++));
				break;
			case 50:
				if (!str.equals("2"))
					break;
				hash.put(Integer.valueOf(2), Integer.valueOf(c2++));
				break;
			case 51:
				if (!str.equals("3"))
					break;
				hash.put(Integer.valueOf(3), Integer.valueOf(c3++));
				break;
			case 52:
				if (!str.equals("4"))
					break;
				hash.put(Integer.valueOf(4), Integer.valueOf(c4++));
				break;
			case 53:
				if (!str.equals("5"))
					break;
				hash.put(Integer.valueOf(5), Integer.valueOf(c5++));
				break;
			case 54:
				if (!str.equals("6"))
					break;
				hash.put(Integer.valueOf(6), Integer.valueOf(c6++));
				break;
			case 55:
				if (!str.equals("7"))
					break;
				hash.put(Integer.valueOf(7), Integer.valueOf(c7++));
				break;
			case 56:
				if (!str.equals("8"))
					break;
				hash.put(Integer.valueOf(8), Integer.valueOf(c8++));
				break;
			case 57:
				if (!str.equals("9"))
					break;
				hash.put(Integer.valueOf(9), Integer.valueOf(c9++));
				break;
			}
		}
		for (int m = 1; m < 10; m++)
			hash.putIfAbsent(Integer.valueOf(m), Integer.valueOf(0));
		hold();
		for (int key = 1; key < 10; key++) {
			hold();
			int value = ((Integer) hash.get(Integer.valueOf(key))).intValue();
			switch (key) {
			case 1:
				digits(1, value);
				System.out.println(
						"ХАРАКТЕР, ЗДАТНIСТЬ ВIДСТОЮВАТИ IНТЕРЕСИ, А ТАКОЖ БАЖАННЯ ВЛАДАРЮВАТИ:\n" + sysout(1, value));
				break;
			case 2:
				digits(2, value);
				System.out.println(
						"ЕНЕРГIЯ. АКТИВНIСТЬ В СУСПIЛЬСТВI: В СIМ'Ї, В ПРАЦI, В ТОВАРИСТВI:\n" + sysout(2, value));
				break;
			case 3:
				digits(3, value);
				System.out.println(
						"СХИЛЬНIСТЬ ДО ТОЧНИХ НАУК ЧИ ЗАХОПЛЕННЯМ ТЕХНОЛОГIЯМИ. ҐРЕЧНIСТЬ:\n" + sysout(3, value));
				break;
			case 4:
				digits(4, value);
				System.out.println("ЗДОРОВ'Я:\n" + sysout(4, value));
				break;
			case 5:
				digits(5, value);
				System.out.println(
						"ЛОГIКА ТА ПЕРЕДЧУТТЯ. ЗДАТНIСТЬ БУДУВАТИ ПЛАНИ, АНАЛIЗ СИТУАЦIЇ, РОБИТИ ПРАВИЛЬНI ВИСНОВКИ:\n"
								+ sysout(5, value));
				break;
			case 6:
				digits(6, value);
				System.out.println("СХИЛЬНIСТЬ ДО ФIЗИЧНОЇ ПРАЦI:\n" + sysout(6, value));
				break;
			case 7:
				digits(7, value);
				System.out.println("ТАЛАН ТА ВДАЧА:\n" + sysout(7, value));
				break;
			case 8:
				digits(8, value);
				System.out.println("ПОЧУТТЯ ОБОВ'ЯЗКУ (НАСАМПЕРЕД ДО РIДНИХ ТА БЛИЗЬКИХ):\n" + sysout(8, value));
				break;
			case 9:
				digits(9, value);
				System.out.println("ПАМ'ЯТЬ, РОЗУМ, IНТУЇЦIЯ ТА ЯСНОВИДIННЯ:\n" + sysout(9, value));
				break;
			}
		}
	}

	private static void digits(int i, int value) {
		System.out.println();
		if (value == 0)
			System.out.print(String.valueOf(i) + "=0");
		for (int d = 0; d < value; d++) {
			System.out.print(i);
			hold();
		}
	}

	private static void hold() {
		try {
			Thread.sleep(50L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static String sysout(int i, int value) {
		System.out.println("");
		switch (i) {
		case 1:
			switch (value) {
			case 1:
				return "Типовий егоїст. Свої iнтереси - понад усе";
			case 2:
				return "Схоже на типового егоїста. Самовдоволення i самовихваляння";
			case 3:
				return "Золота середина. Врiвноважена людина";
			case 4:
				return "Сильний характер. Рiшучiсть i дiєвiсть";
			case 5:
				return "Диктатор";
			case 6:
				return "Досить жорстокий, складний характер. Але здатен на благородний вчинок";
			}
			return "Зустрiчається лише у людей, народжених пiсля 2000 року. Вважає, що свiт крутиться навколо нього i всi йому чимось зобов'язанi. Важливо ще змалку применшувати вiдчуття неповторностi i особливостi, краще виховання в колективi";
		case 2:
			switch (value) {
			case 1:
				return "Досить своєї енергiї, для пiдтримки балансу рекомендується спорт";
			case 2:
				return "Золота середина. Рiвновага i гармонiя. Своєю енергiєю з радiстю дiлиться з оточуючими";
			case 3:
				return "З нього може вийти непоганий екстрасенс. Є сенс розвивати iнтуїцiю";
			case 4:
				return "Користується популярнiстю у протилежної статi за рахунок своєї активностi i безпосередностi. Особливо привабливий для людей з трьома шiстками";
			case 5:
				return "Мегасоцiально активний чувак";
			case 6:
				return "Мата Харi";
			}
			return "Це по-хорошому енергетичнi вампiри. Вони вiдкритi для спiлкування, пiдживлюються вiд оточуючих новими iдеями та враженнями";
		case 3:
			switch (value) {
			case 1:
				return "Прибирання за настроєм. У нього може бути як iдеальний порядок, так i хаос. Як вдома, так i в головi";
			case 2:
				return "Перед нами вчений. Або кандидат на вченi. Точнi науки цiкавлять i даються легко";
			case 3:
				return "Бажання є, а можливостей мало. Як би не хотiв заглибитися у вивчення формул, не виходить";
			case 4:
				return "Виключна обдарованiсть, величезний потенцiал. Iнодi «генiй чистого пiзнання», переважно - професiонал екстра-класу";
			case 5:
				return "Виключна обдарованiсть, величезний потенцiал. Iнодi «генiй чистого пiзнання», переважно - професiонал екстра-класу";
			case 6:
				return "Виключна обдарованiсть, величезний потенцiал. Iнодi «генiй чистого пiзнання», переважно - професiонал екстра-класу";
			}
			return "Пунктуальний i дуже любить чистоту";
		case 4:
			switch (value) {
			case 1:
				return "Здоров'я пересiчної людини. Хворiє, але не часто";
			case 2:
				return "Мiцний горiшок. Вiн не простудиться на протязi, та й будь-яка хвороба швидко мине. Запас здоров'я позначається на сексуальнiй активностi";
			case 3:
				return "Дуже мiцне здоров'я та висока сексуальна активнiсть";
			case 4:
				return "Коняче здоров'я, рани гояться швидко, сексуальний маньяк";
			case 5:
				return "Зцiлює себе сам";
			case 6:
				return "Здоров'я ангела";
			}
			return "Слабкий, схильний до хвороб; особливо, якщо в матрицi багато двiйок";
		case 5:
			switch (value) {
			case 1:
				return "Iнтуїцiя розвинена. У життi все дається легко";
			case 2:
				return "Хороша iнтуїцiя. Головне до неї прислухатися. Часто з володарiв двох п'ятiрок виходять грамотнi слiдчi i юристи";
			case 3:
				return "Помиляти для них - рiдкiсть, адже вони майже ясновидцi. Доля постiйно посилає їм знаки згори, якими вони вмiло користуються";
			case 4:
				return "Є всi шанси стати екстрасенсом. Здатнiсть передбачати майбутнє. Сняться вiщi сни, а також здатнiсть швидко отримувати вiдповiдi на питання";
			case 5:
				return "Ви Алана Чумак";
			case 6:
				return "Ви Кашпiровський";
			}
			return "Його мозок завжди в роботi. Вiн щось вигадує, щось доводить, в тому числi i самому собi. Методом проб i помилок досягає поставленої мети";
		case 6:
			switch (value) {
			case 1:
				return "Фiзична праця необхiдна, однак можна знайти себе в iнших сферах";
			case 2:
				return "У цьому випадку займатися фiзичною працею не обов'язково, але власники двох шiсток люблять майструвати щось своїми руками. У даному випадку це скорiше хобi, нiж професiя";
			case 3:
				return "На них можна покластися. Сумлiнно виконують свою роботу. Але їм необхiдне пiдживлення. Найчастiше енергiю беруть у партнера з великою кiлькiстю двiйок";
			case 4:
				return "Справжнiй роботяга. Йому складно сидiти без дiла. Завжди повинен чимось займатися, при цьому отримує величезне задоволення. Якщо присутнi ще й дев'ятки, є сенс отримати вищу освiту, врiвноважити надмiрну активнiсть";
			case 5:
				return "Безпрецедентний роботоголiк";
			case 6:
				return "Кiборг. Працює до розрядки батареї";
			}
			return "Призначення людини - фiзична праця. «Золотi руки». Непоганi ремiсники, теслi, маляри. Однак фiзична праця не завжди у задоволення ";
		case 7:
			switch (value) {
			case 1:
				return "Життя дається легко. Але яскравих його проявiв i крутих поворотiв долi чекати не варто";
			case 2:
				return "Талановитi. Є шанс стати вiдомим художником або музикантом. Однак, якщо не розвиватися в професiї або творчостi, плюс може легко змiнитися на мiнус. Адже цим людям з легкiстю дається не тiльки гарне, але й погане";
			case 3:
				return "Насичене яскравими подiями життя. Нерiдко захоплюються екстремальними видами спорту. Ризик не лякає їх, скорiше вабить. Однак є сенс перiодично зменшувати оберти i вiдпочивати";
			case 4:
				return "Найчастiше власники чотирьох сiмок не пристосованi до життя. На жаль, їх життєвий шлях недовгий. Навiть якщо їх життя тривале, воно буде переповнене недугами";
			case 5:
				return "Бетховен";
			case 6:
				return "Господь Бог";
			}
			return "Життя складне, всього доведеться досягати власною працею, вчитися на своїх помилках. Не виключена вiдмова вiд мирського життя i втеча в релiгiю";
		case 8:
			switch (value) {
			case 1:
				return "На нього можна покластися. Завжди готовий надати пiдтримку";
			case 2:
				return "Бажання допомагати закладено у нього в генах. Варто тiльки попросити, як вiн кине свої справи i придiлить вам увагу";
			case 3:
				return "Володар трьох вiсiмок охоплює турботою не тiльки своїх близьких i друзiв, але i всiх стражденних. Небайдужий до страждань народу, готовий пiти на жертви, щоб домогтися справедливостi";
			case 4:
				return "Перед нами талановитий психолог, якому не набридає слухати, проявляти турботу i милосердя. У той же час володiє має потяг до точних наук";
			case 5:
				return "Ви - Гандi";
			case 6:
				return "Ви Iсус Христос";
			}
			return "Не чекайте вiд нього пожертвувань. Сама iз задоволенням прийме сторонню допомогу i пiдтримку. А ось дбати за iнтереси iнших понад свої навряд чи зможе";
		case 9:
			switch (value) {
			case 1:
				return "Змушуйте свiй мозок постiйно працювати. Розгадуйте кросворди, вчiть вiршi. Якщо другої дев'ятки немає в матрицi, її треба вiдпрацьовувати";
			case 2:
				return "У володарiв двох дев'яток з розумовими здiбностями все гаразд. Є всi данi для успiшного розвитку. Але необхiдно постiйно працювати, просто так нiчого не дається";
			case 3:
				return "Запасу розуму вистачає на те, щоб докладати мiнiмум зусиль для гарного навчання i успiшної кар'єри. Таким людям все дається легко";
			case 4:
				return "Їм вiдкривається iстина. Вони практично на сто вiдсоткiв захищенi вiд провалу в будь-якому починаннi. Можливо тому, що для них все дуже просто, вони жорстокi, неприємнi в спiлкуваннi, дивляться на всiх зверхньо i часто бувають неадекватнi";
			case 5:
				return "Ангел";
			case 6:
				return "Господь Бог";
			}
			return "Вiдсутнiсть дев'ятки є у народжених пiсля 2000 року. З дитинства треба починати розвивати пам'ять i логiку, щоб уже до школи заповнити цей дефiцит властивостей";
		}
		return null;
	}
}
