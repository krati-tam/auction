import React,{useState} from "react"
export const productComponent = () => {
    const [product, setproduct] = useState([])
  return (
    <div classname="container">
        <h2 className ="test-center"> Product List </h2>
        <table className ="table table-bordered table-striped">
            <thead>
                <th>Product Id</th>
                <th>Product Name</th>
              <th> Short Description</th>
              <th>Detailed Description</th>
              <th>Category</th>
              <th>Starting Price</th>
              <th> Bid end date</th>
            </thead>
            <tbody>
                 { 
                 product.map(
                 product =>
                 <tr key = {product.id}>
                   <td>product.name</td>
                   <td>product.shortDesc</td>
                    <td>product.detailedDesc</td>
                    <td>product.category</td>
                    <td>product.price</td>
                    <td>product.enddate</td>
                 
                  </tr>
                 )
                    }
                    
            </tbody>
        </table>
        productComponent

    </div>
  )
}
