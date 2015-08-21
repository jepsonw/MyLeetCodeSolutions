import java.util.Stack;

/**
 * Created by kaijiezhou on 15-8-21.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {

        String[] splited=path.split("/");
        //splited[0] is " "
        Stack<String> folders=new Stack<>();
        for(int i=1;i<splited.length;i++){
            switch(splited[i]){
                case ".":break;
                case "..":
                    if(folders.size()>0){
                        folders.pop();
                    }
                    break;
                case "":
                    break;
                default:
                    folders.push(splited[i]);
            }
        }
        if(folders.empty()) return "/";
        StringBuilder newPath=new StringBuilder(0);
        while(!folders.empty()){
            newPath.insert(0,"/"+folders.pop());
        }
        return newPath.toString();


    }



}
