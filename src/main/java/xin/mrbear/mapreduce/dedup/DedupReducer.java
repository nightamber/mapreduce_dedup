package xin.mrbear.mapreduce.dedup;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class DedupReducer extends Reducer<Text, NullWritable, Text, NullWritable>{
    @Override  
    protected void reduce(Text key, Iterable<NullWritable> values,  
            Context context) throws IOException, InterruptedException {  
  
  
  //NullWritable是Writable的一个特殊类，实现方法为空实现，不从数据流中读数据，也不写入数据，只充当占位符，
  //如在MapReduce中，如果你不需要使用键或值，你就可以将键或值声明为NullWritable,NullWritable是一个不可变的单实例类型。
        context.write(key, NullWritable.get());  
  
    }  


}
