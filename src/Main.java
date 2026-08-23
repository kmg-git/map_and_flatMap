import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Map<String, Map<String, String>> departments = Map.of(
                "컴퓨터공학과", Map.of(
                        "김민규", "010-1111-1111",
                        "김명운", "010-2222-2222",
                        "박도현", "010-3333-3333"
                ),
                "전자공학과", Map.of(
                        "제엘또", "010-4444-4444",
                        "넛바나", "010-5555-5555"
                )
        );

        Map<String, List<String>> result =
                departments.entrySet().stream()
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                entry -> entry.getValue().entrySet().stream()
                                        .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                                        .toList()
                        ));

        System.out.println("끼요옷");
        System.out.println("끼요옷2");
        System.out.println("끼요3");

    }


}