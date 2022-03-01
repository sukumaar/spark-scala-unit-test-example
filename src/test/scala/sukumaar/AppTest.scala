package sukumaar
import org.scalatest.funsuite.AnyFunSuite

class AppTest extends AnyFunSuite 
  with TraitSparkSessionTest //<-this is the same trait having sparkSession
  {

  import sparkSession.implicits._ 
  // this will enable methods like toDF() to DS

  test("this is sample test") {

    val rdd = sparkSession
    .sparkContext
    .parallelize(Seq("A", "B"))

    val ds = rdd.toDS
    ds.show() 
    //for sake of debugging, otherwise it should be avoided

    ds.cache()
    /*
    ds.cache()  not required if action operation on 
    dataset/dataframe is getting performed only once
    but otherwise
    */

    assert(2 == ds.count()) // assertion
  }
}
