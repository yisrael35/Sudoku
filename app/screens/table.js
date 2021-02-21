// npm install react-native-smart-sudoku-grid --save

import React, { Component } from "react";
import generator from "sudoku";
window.generator = generator;
class App extends Component {
  render() {
    return <div>hello yisrael</div>;
  }
}
export default App;

// import { StyleSheet, Text, View } from "react-native";

// export default class Table extends Component {
//     renderRow() {
//         return (
//             <View style={{ flex: 1, alignSelf: 'stretch', flexDirection: 'row' }}>
//                 <View style={{ flex: 1, alignSelf: 'stretch' }} /> { /* Edit these as they are your cells. You may even take parameters to display different data / react elements etc. */}
//                 <View style={{ flex: 1, alignSelf: 'stretch' }} />
//                 <View style={{ flex: 1, alignSelf: 'stretch' }} />
//                 <View style={{ flex: 1, alignSelf: 'stretch' }} />
//                 <View style={{ flex: 1, alignSelf: 'stretch' }} />
//             </View>
//         );
//     }

//     render() {
//         const data = [1, 2, 3, 4, 5];
//         return (
//             <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
//             {
//                 data.map((datum) => { // This will render a row for each data element.
//                     return this.renderRow();
//                 })
//             }
//             </View>
//         );
//     }
// }
