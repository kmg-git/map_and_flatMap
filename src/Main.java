import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 10)
                .boxed()
                .toList();

        List<Integer> list2 =
                list.stream().map(n ->(int) Math.pow(n,2)).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);

    }


}